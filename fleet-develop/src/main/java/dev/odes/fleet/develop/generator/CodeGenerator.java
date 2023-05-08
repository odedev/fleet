package dev.odes.fleet.develop.generator;

import dev.odes.fleet.common.utils.CaseFormatUtils;
import dev.odes.fleet.develop.enumeration.ModuleTypeEnum;
import dev.odes.fleet.develop.model.ModelModel;
import dev.odes.fleet.develop.model.ModuleModel;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CodeGenerator {
    public static void generate(ModuleModel module, List<ModelModel> models) {
        TemplateContext templateContext = new TemplateContext();
        templateContext.setModule(module);

        generateModule(templateContext);

        models.forEach(model -> {
            templateContext.setModel(model);

            generateJava(templateContext);
        });
    }

    public static void generateModule(TemplateContext templateContext) {
        VelocityInitializer.init();
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("templateContext", templateContext);

        String moduleCode = templateContext.getModule().getCode();

        Map<String, String> templateFileMap = TemplateMethod.TEMPLATE_FILE;
        Map<String, String> targetDirMap = TemplateMethod.MODULE_TARGET_DIR;

        for (String file : TemplateMethod.MODULE_FILES) {
            String targetDir = targetDirMap.get(file);
            String path = TemplateMethod.getModuleTargetPath(targetDir, file, moduleCode);
            if (new File(path).exists()) {
                continue;
            }

            String templateFile = templateFileMap.get(file);
            if (templateFile == null) {
                continue;
            }

            write(velocityContext, templateFile, path);
        }
    }

    public static void generateJava(TemplateContext templateContext) {
        VelocityInitializer.init();
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("templateContext", templateContext);

        String moduleCode = templateContext.getModule().getCode();
        String entityCode = templateContext.getModel().getCode();

        Map<String, String> templateFileMap = TemplateMethod.TEMPLATE_FILE;
        Map<String, String> targetDirMap = TemplateMethod.JAVA_TARGET_DIR;

        for (String file : TemplateMethod.JAVA_FILES) {
            entityCode = CaseFormatUtils.upperCamel(entityCode);

            String targetDir = targetDirMap.get(file);
            String path = TemplateMethod.getJavaTargetPath(targetDir, file, moduleCode, entityCode);
            if (!Arrays.asList(TemplateMethod.JAVA_REWRITE_FILES).contains(file) && new File(path).exists()) {
                continue;
            }
            String templateFile = templateFileMap.get(file);
            if (templateFile == null) {
                continue;
            }

            write(velocityContext, templateFile, path);
        }
    }

    public static void write(VelocityContext velocityContext, String templateFile, String path) {
        StringWriter stringWriter = new StringWriter();
        Template template = Velocity.getTemplate(templateFile, TemplateConstant.TEMPLATE_ENCODING);
        template.merge(velocityContext, stringWriter);
        String content = stringWriter.toString();

        try {
            FileUtils.writeStringToFile(new File(path), content, TemplateConstant.TEMPLATE_ENCODING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

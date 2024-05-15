package dev.osmanthus.fleet.tool.develop.generator;

import dev.osmanthus.fleet.common.utils.CaseFormatUtils;
import dev.osmanthus.fleet.tool.develop.model.ModelFieldModel;
import dev.osmanthus.fleet.tool.develop.model.ModelModel;
import dev.osmanthus.fleet.tool.develop.model.ModuleModel;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

public class CodeGenerator {
    public static void generate(ModuleModel module, List<ModelModel> models) {
        TemplateContext templateContext = new TemplateContext();
        templateContext.setModule(module);

        generateModule(templateContext);

        models.forEach(model -> {
            model.getFields().sort(Comparator.comparing(ModelFieldModel::getSequence));
            templateContext.setModel(model);
            generateModel(templateContext);
        });
    }

    public static void generateModule(TemplateContext templateContext) {
        VelocityInitializer.init();
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("templateContext", templateContext);

        String moduleCode = templateContext.getModule().getCode();

        Map<String, String> templateFileMap = TemplateUtils.TEMPLATE_FILE;
        Map<String, String> targetDirMap = TemplateUtils.MODULE_TARGET_DIR;

        for (String file : TemplateUtils.MODULE_FILES) {
            String targetDir = targetDirMap.get(file);
            String path = TemplateUtils.getModuleTargetPath(targetDir, file, moduleCode);
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

    public static void generateModel(TemplateContext templateContext) {
        VelocityInitializer.init();
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("templateContext", templateContext);

        String moduleCode = templateContext.getModule().getCode();
        String modelCode = templateContext.getModel().getCode();
        modelCode = CaseFormatUtils.upperCamel(modelCode);

        Map<String, String> templateFileMap = TemplateUtils.TEMPLATE_FILE;
        Map<String, String> modelJavaTargetDir = TemplateUtils.MODEL_JAVA_TARGET_DIR;
        Map<String, String> modelResourcesTargetDir = TemplateUtils.MODEL_RESOURCES_TARGET_DIR;
        Map<String, String> modelUITargetDir = TemplateUtils.MODEL_UI_TARGET_DIR;


        for (String file : TemplateUtils.MODEL_JAVA_FILES) {
            String targetDir = modelJavaTargetDir.get(file);
            String path = TemplateUtils.getModelJavaTargetPath(targetDir, file, moduleCode, modelCode);
            if (!Arrays.asList(TemplateUtils.JAVA_REWRITE_FILES).contains(file) && new File(path).exists()) {
                continue;
            }
            String templateFile = templateFileMap.get(file);
            if (templateFile == null) {
                continue;
            }

            write(velocityContext, templateFile, path);
        }

        for (String file : TemplateUtils.MODEL_RESOURCES_FILES) {
            String targetDir = modelResourcesTargetDir.get(file);
            String path = TemplateUtils.getModelResourcesTargetPath(targetDir, file, moduleCode, modelCode);
            String templateFile = templateFileMap.get(file);
            if (templateFile == null) {
                continue;
            }
            write(velocityContext, templateFile, path);
        }


        for (String file : TemplateUtils.MODEL_UI_FILES) {
            String targetDir = modelUITargetDir.get(file);
            String path = TemplateUtils.getModelUITargetPath(targetDir, file, moduleCode, modelCode);
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

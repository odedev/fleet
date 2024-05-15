package dev.osmanthus.fleet.tool.develop.generator;

import dev.osmanthus.fleet.common.utils.StringUtils;

import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class TemplateUtils {
    public static final String[] MODULE_FILES = {
        TemplateConstant.MODULE_TARGET_POM
    };

    public static final String[] MODULE_UI_FILES = {
        TemplateConstant.MODULE_TARGET_PACKAGE
    };

    public static final String[] MODEL_JAVA_FILES = {
        TemplateConstant.MODEL_TARGET_ENTITY,
        TemplateConstant.MODEL_TARGET_MODEL,
        TemplateConstant.MODEL_TARGET_CONTROLLER,
        TemplateConstant.MODEL_TARGET_SERVICE,
        TemplateConstant.MODEL_TARGET_REPOSITORY,
        TemplateConstant.MODEL_TARGET_MAPPER,
        TemplateConstant.MODEL_TARGET_TRANSFORM
    };

    public static final String[] MODEL_RESOURCES_FILES = {
        TemplateConstant.MODEL_TARGET_MAPPER_XML,
        TemplateConstant.MODEL_TARGET_CREATE_SQL
    };

    public static final String[] MODEL_UI_FILES = {
        TemplateConstant.MODEL_TARGET_JS
    };

    public static final String[] JAVA_REWRITE_FILES = {
        TemplateConstant.MODEL_TARGET_ENTITY,
        TemplateConstant.MODEL_TARGET_MODEL,
        TemplateConstant.MODEL_TARGET_TRANSFORM
    };


    public static final Map<String, String> TEMPLATE_FILE = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODULE_TARGET_POM, getModuleVMFile("pom.xml.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODULE_TARGET_PACKAGE, getModuleVMFile("package.json.vm")),

            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_ENTITY, getModelVMFile("entity.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_MODEL, getModelVMFile("model.java.vm")),
//            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_METADATA, getVMPath("metadata.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_CONTROLLER, getModelVMFile("controller.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_SERVICE, getModelVMFile("service.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_REPOSITORY, getModelVMFile("repository.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_MAPPER, getModelVMFile("mapper.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_TRANSFORM, getModelVMFile("transform.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_MAPPER_XML, getModelVMFile("mapper.xml.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_CREATE_SQL, getModelVMFile("create.sql.vm")),

            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_JS, getModelVMFile("model.js.vm"))
        )
    );

    public static final Map<String, String> MODEL_JAVA_TARGET_DIR = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_ENTITY, "entity"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_MODEL, "model"),
//            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_METADATA, "metadata"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_CONTROLLER, "controller"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_SERVICE, "service"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_REPOSITORY, "repository"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_MAPPER, "mapper"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_TRANSFORM, "transform")
        )
    );

    public static final Map<String, String> MODEL_RESOURCES_TARGET_DIR = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_MAPPER_XML, "mapper"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_CREATE_SQL, "sql")
        )
    );

    public static final Map<String, String> MODEL_UI_TARGET_DIR = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODEL_TARGET_JS, "models")
        )
    );

    public static final Map<String, String> MODULE_TARGET_DIR = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(TemplateConstant.MODULE_TARGET_POM, "")
        )
    );

    public static Map<String, String> getTemplateFile() {
        return TEMPLATE_FILE;
    }

    public static Map<String, String> getModelJavaTargetDir() {
        return MODEL_JAVA_TARGET_DIR;
    }

    public static String getTargetDir(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + fileName;
    }

    public static String getModuleVMFile(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + "module" + File.separator + fileName;
    }

    public static String getModelVMFile(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + "model" + File.separator + fileName;
    }

    public static String getEnumVMFile(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + "enum" + File.separator + fileName;
    }

    public static String getViewVMFile(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + "view" + File.separator + fileName;
    }

    public static String getModulePath(String moduleCode) {
        StringBuilder path = new StringBuilder();

//        path.append("workspace")
//            .append(File.separator)
//            .append("fleet")
//            .append(File.separator);

        path.append(TemplateConstant.MODULE_DIR)
            .append(File.separator)
            .append("fleet-module-")
            .append(moduleCode);

        return path.toString();
    }


    public static String getModuleUIPath(String moduleCode) {
        StringBuilder path = new StringBuilder();

//        path.append("workspace")
//            .append(File.separator)
//            .append("fleet")
//            .append(File.separator);

        path.append(TemplateConstant.UI_DIR)
            .append(File.separator)
            .append("modules")
            .append(File.separator)
            .append("module-")
            .append(moduleCode);

        return path.toString();
    }

    public static String getModuleTargetPath(String targetDir, String fileName, String moduleCode) {
        StringBuilder path = new StringBuilder(getModulePath(moduleCode));

        path.append(File.separator)
//            .append(targetDir)
//            .append(File.separator)
            .append(fileName);

        return path.toString();
    }

    public static String getModelJavaTargetPath(String targetDir, String fileName, String moduleCode, String modelCode) {
        StringBuilder path = new StringBuilder(getModulePath(moduleCode));

        path.append(File.separator)
            .append(TemplateConstant.JAVA_PATH)
            .append(File.separator)
            .append(TemplateConstant.MODULE_PACKAGE_PATH);

        path.append(File.separator)
            .append(moduleCode);

        if (!StringUtils.isNullOrEmpty(targetDir)) {
            path.append(File.separator).append(targetDir);
        }

        path.append(File.separator).append(modelCode).append(fileName);

        return path.toString();
    }

    public static String getModelResourcesTargetPath(String targetDir, String fileName, String moduleCode, String modelCode) {
        StringBuilder path = new StringBuilder(getModulePath(moduleCode));

        path.append(File.separator)
            .append(TemplateConstant.RESOURCES_PATH);

        if (!StringUtils.isNullOrEmpty(targetDir)) {
            path.append(File.separator).append(targetDir);
        }

        path.append(File.separator).append(modelCode).append(fileName);

        return path.toString();
    }


    public static String getModelUITargetPath(String targetDir, String fileName, String moduleCode, String modelCode) {
        StringBuilder path = new StringBuilder(getModuleUIPath(moduleCode));

        path.append(File.separator)
            .append(TemplateConstant.UI_PATH);

        if (!StringUtils.isNullOrEmpty(targetDir)) {
            path.append(File.separator).append(targetDir);
        }

        path.append(File.separator).append(modelCode).append(fileName);

        return path.toString();
    }

}

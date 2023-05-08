package dev.odes.fleet.develop.generator;

import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class TemplateMethod {
    public static final String[] MODULE_FILES = {
        TemplateConstant.TARGET_POM
    };

    public static final String[] JAVA_FILES = {
        TemplateConstant.TARGET_ENTITY,
        TemplateConstant.TARGET_MODEL,
        TemplateConstant.TARGET_CONTROLLER,
        TemplateConstant.TARGET_SERVICE,
        TemplateConstant.TARGET_REPOSITORY,
        TemplateConstant.TARGET_MAPPER,
        TemplateConstant.TARGET_TRANSFORM
    };

    public static final String[] JAVA_REWRITE_FILES = {
        TemplateConstant.TARGET_ENTITY,
        TemplateConstant.TARGET_MODEL,
        TemplateConstant.TARGET_TRANSFORM
    };


    public static final Map<String, String> TEMPLATE_FILE = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_ENTITY, getJavaVMFile("entity.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MODEL, getJavaVMFile("model.java.vm")),
//            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_METADATA, getVMPath("metadata.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_CONTROLLER, getJavaVMFile("controller.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_SERVICE, getJavaVMFile("service.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_REPOSITORY, getJavaVMFile("repository.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MAPPER, getJavaVMFile("mapper.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_TRANSFORM, getJavaVMFile("transform.java.vm")),

            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_POM, getModuleVMFile("pom.xml.vm"))
        )
    );

    public static final Map<String, String> JAVA_TARGET_DIR = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_ENTITY, "entity"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MODEL, "model"),
//            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_METADATA, "metadata"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_CONTROLLER, "controller"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_SERVICE, "service"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_REPOSITORY, "repository"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MAPPER, "mapper"),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_TRANSFORM, "transform")
        )
    );

    public static final Map<String, String> MODULE_TARGET_DIR = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_POM, "")
        )
    );

    public static Map<String, String> getTemplateFile() {
        return TEMPLATE_FILE;
    }

    public static Map<String, String> getJavaTargetDir() {
        return JAVA_TARGET_DIR;
    }

    public static String getTargetDir(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + fileName;
    }

    public static String getJavaVMFile(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + "java" + File.separator + fileName;
    }

    public static String getModuleVMFile(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + fileName;
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

    public static String getJavaTargetPath(String targetDir, String fileName, String moduleCode, String entityCode) {
        StringBuilder path = new StringBuilder(getModulePath(moduleCode));

        path.append(File.separator)
            .append(TemplateConstant.JAVA_PATH)
            .append(File.separator)
            .append(TemplateConstant.MODULE_PACKAGE_PATH);

        path.append(File.separator)
            .append(moduleCode)
            .append(File.separator)
            .append(targetDir)
            .append(File.separator)
            .append(entityCode)
            .append(fileName);

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

}

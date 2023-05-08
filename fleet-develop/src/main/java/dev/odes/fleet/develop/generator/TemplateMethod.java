package dev.odes.fleet.develop.generator;

import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class TemplateMethod {
    public static final Map<String, String> TEMPLATE_FILE = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_ENTITY, getVMFile("entity.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MODEL, getVMFile("model.java.vm")),
//            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_METADATA, getVMPath("metadata.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_CONTROLLER, getVMFile("controller.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_SERVICE, getVMFile("service.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_REPOSITORY, getVMFile("repository.java.vm")),
            new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MAPPER, getVMFile("mapper.java.vm"))
        )
    );

    public static final Map<String, String> TARGET_DIR = new HashMap<>(
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

    public static Map<String, String> getTemplateFile() {
        return TEMPLATE_FILE;
    }

    public static Map<String, String> getTargetDir() {
        return TARGET_DIR;
    }

    public static String getVMFile(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + fileName;
    }

    public static String getTargetDir(String fileName) {
        return TemplateConstant.TEMPLATE_DIR + File.separator + fileName;
    }

    public static String getTargetPath(String targetDir, String entityCode, String fileName) {
        return TemplateConstant.MODULE_PACKAGE_PATH + File.separator + targetDir + File.separator + entityCode + fileName;
    }

}

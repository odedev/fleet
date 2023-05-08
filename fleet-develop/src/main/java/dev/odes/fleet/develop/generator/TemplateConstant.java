package dev.odes.fleet.develop.generator;

import java.io.File;

public class TemplateConstant {

    public static final String TEMPLATE_ENCODING = "UTF-8";

    public static final String TEMPLATE_DIR = "template";
    public static final String MODULE_DIR = "fleet-module";

    public static final String JAVA_PATH = "src"+ File.separator + "main" + File.separator + "java";
    public static final String RESOURCES_PATH = "src"+ File.separator + "main" + File.separator + "resources";

    public static final String ROOT_PACKAGE_PATH = "dev" + File.separator + "odes" + File.separator + "fleet";
    public static final String MODULE_PACKAGE_PATH = ROOT_PACKAGE_PATH + File.separator + "module";
    public static final String core_PACKAGE_PATH = ROOT_PACKAGE_PATH + File.separator + "core";

    public static final String ROOT_PACKAGE = "dev.odes.fleet";
    public static final String module_PACKAGE = ROOT_PACKAGE + ".module";

    public static final String TARGET_ENTITY = ".java";
    public static final String TARGET_MODEL = "Model.java";
//    public static final String TARGET_METADATA = "Metadata.java";
    public static final String TARGET_CONTROLLER = "Controller.java";
    public static final String TARGET_SERVICE = "Service.java";
    public static final String TARGET_REPOSITORY = "Repository.java";
    public static final String TARGET_MAPPER = "Mapper.java";
    public static final String TARGET_TRANSFORM = "Transform.java";

    public static final String TARGET_ENUM = "Enum.java";

    public static final String TARGET_POM = "pom.xml";

}

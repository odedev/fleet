package dev.osmanthus.fleet.tool.develop.generator;

import java.io.File;

public class TemplateConstant {

    public static final String TEMPLATE_ENCODING = "UTF-8";

    public static final String TEMPLATE_DIR = "template";
    public static final String MODULE_DIR = "fleet-module";
    public static final String UI_DIR = "fleet-ui";

    public static final String JAVA_PATH = "src" + File.separator + "main" + File.separator + "java";
    public static final String RESOURCES_PATH = "src" + File.separator + "main" + File.separator + "resources";

    public static final String ROOT_PACKAGE_PATH = "dev" + File.separator + "odes" + File.separator + "fleet";
    public static final String MODULE_PACKAGE_PATH = ROOT_PACKAGE_PATH + File.separator + "module";

    public static final String UI_PATH = "src";

    public static final String ROOT_PACKAGE = "dev.osmanthus.fleet";

    public static final String MODULE_TARGET_POM = "pom.xml";
    public static final String MODULE_TARGET_PACKAGE = "package.json";

    public static final String MODEL_TARGET_ENTITY = ".java";
    public static final String MODEL_TARGET_MODEL = "Model.java";
    public static final String MODEL_TARGET_CONTROLLER = "Controller.java";
    public static final String MODEL_TARGET_SERVICE = "Service.java";
    public static final String MODEL_TARGET_REPOSITORY = "Repository.java";
    public static final String MODEL_TARGET_MAPPER = "Mapper.java";
    public static final String MODEL_TARGET_TRANSFORM = "Transform.java";
    public static final String MODEL_TARGET_METADATA = "Metadata.java";

    public static final String MODEL_TARGET_MAPPER_XML = "Mapper.xml";
    public static final String MODEL_TARGET_CREATE_SQL = "Create.sql";

    public static final String MODEL_TARGET_JS = "Model.js";


    public static final String Enum_TARGET_ENUM = "Enum.java";


}

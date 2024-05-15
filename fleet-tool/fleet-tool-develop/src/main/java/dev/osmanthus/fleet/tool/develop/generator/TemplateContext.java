package dev.osmanthus.fleet.tool.develop.generator;

import dev.osmanthus.fleet.common.enumeration.DataTypeEnum;
import dev.osmanthus.fleet.common.utils.CaseFormatUtils;
import dev.osmanthus.fleet.tool.develop.model.ModelFieldModel;
import dev.osmanthus.fleet.tool.develop.model.ModelModel;
import dev.osmanthus.fleet.tool.develop.model.ModuleModel;

import java.util.ArrayList;
import java.util.List;

public class TemplateContext {
    private String moduleType;
    private ModuleModel module;
    private ModelModel model;

    public TemplateContext() {
    }

    public TemplateContext(String moduleType, ModuleModel module, ModelModel model) {
        this.moduleType = moduleType;
        this.module = module;
        this.model = model;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public ModuleModel getModule() {
        return module;
    }

    public void setModule(ModuleModel module) {
        this.module = module;
    }

    public ModelModel getModel() {
        return model;
    }

    public void setModel(ModelModel model) {
        this.model = model;
    }

    public List<ModelFieldModel> getModelList() {
        List<ModelFieldModel> modelFields = this.getModel().getFields();
        List<ModelFieldModel> modelFieldList = new ArrayList<>();
        modelFields.forEach(modelField -> {
            if (modelField.getDataType().equals(DataTypeEnum.MODEL)) {
                modelFieldList.add(modelField);
            }
        });
        return modelFieldList;
    }

    public List<ModelFieldModel> getEnumList() {
        List<ModelFieldModel> modelFields = this.getModel().getFields();
        List<ModelFieldModel> modelFieldList = new ArrayList<>();
        modelFields.forEach(modelField -> {
            if (modelField.getDataType().equals(DataTypeEnum.ENUM)) {
                modelFieldList.add(modelField);
            }
        });
        return modelFieldList;
    }

    public String getRepositoryTypeList() {
        List<ModelFieldModel> modelFields = this.getModelList();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(modelFields.size());
        for (int i = 0; i < modelFields.size(); i++) {
            ModelFieldModel modelField = modelFields.get(i);
            String repositoryType = getRepositoryType(modelField.getModelType());
            stringBuilder.append(repositoryType);
            stringBuilder.append(" ");
            stringBuilder.append(lowerCamel(repositoryType));
            if (i != modelFields.size() - 1) {

                stringBuilder.append(", ");
            }
        }

        return stringBuilder.toString();
    }

    public static String getModelFieldType(ModelFieldModel modelField) {
        return DataTypeUtils.getModelDataType(modelField);
    }

    public static String getEntityFieldType(ModelFieldModel modelField) {
        return DataTypeUtils.getEntityDataType(modelField);
    }

    public static String getEntityImport(ModelModel modelModel) {
        String entityImport = "";
        if (modelModel != null) {
            String fullName = modelModel.getFullName();
            entityImport = fullName.replace(".model", ".entity");
            entityImport = entityImport.replace("Model", "");
        }

        return entityImport;
    }

    public static String getRepositoryType(ModelModel modelModel) {
        String repository = "";
        if (modelModel != null) {
            String code = modelModel.getCode();
            repository = code + "Repository";
        }

        return repository;
    }

    public static String getRepositoryImport(ModelModel modelModel) {
        String repositoryImport = "";
        if (modelModel != null) {
            String fullName = modelModel.getFullName();
            repositoryImport = fullName.replace(".model", ".repository");
            repositoryImport = repositoryImport.replace("Model", "Repository");
        }

        return repositoryImport;
    }


    public static String getSqlColumn(ModelFieldModel modelField) {
        String name = modelField.getName();
        Boolean isNullable = modelField.getIsNullable();
        StringBuilder column = new StringBuilder();

        // columnName
        column.append("`");
        column.append(lowerUnderscore(modelField.getCode()));
        column.append("`");

        // columnType
        column.append(" ");
        String sqlDataType = DataTypeUtils.getSqlDataType(modelField);
        column.append(sqlDataType);

        // Nullable
        column.append(" ");
        if (isNullable != null && !isNullable) {
            column.append("NOT NULL");
        } else {
            column.append("NULL");
        }

        // DEFAULT
        column.append(" ");
        column.append("DEFAULT");
        column.append(" ");
        column.append("NULL");

        // COMMENT
        column.append(" ");
        column.append("COMMENT");

        column.append(" ");
        column.append("'");
        if (name != null) {
            column.append(name);
        }
        column.append("'");
        column.append(",");

        return column.toString();
    }

    public static Boolean isModelDataType(ModelFieldModel modelField) {
        return DataTypeUtils.isModelDataType(modelField);
    }

    public static Boolean isEnumDataType(ModelFieldModel modelField) {
        return DataTypeUtils.isEnumDataType(modelField);
    }

    public static Boolean isFileDataType(ModelFieldModel modelField) {
        return DataTypeUtils.isFileDataType(modelField);
    }

    public static String upperCamel(String word) {
        return CaseFormatUtils.upperCamel(word);
    }

    public static String lowerUnderscore(String word) {
        return CaseFormatUtils.lowerUnderscore(word);
    }

    public static String lowerCamel(String word) {
        return CaseFormatUtils.lowerCamel(word);
    }
}

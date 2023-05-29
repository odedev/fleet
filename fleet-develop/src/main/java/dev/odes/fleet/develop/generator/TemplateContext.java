package dev.odes.fleet.develop.generator;

import dev.odes.fleet.common.enumeration.DataTypeEnum;
import dev.odes.fleet.common.utils.CaseFormatUtils;
import dev.odes.fleet.develop.model.ModelFieldModel;
import dev.odes.fleet.develop.model.ModelModel;
import dev.odes.fleet.develop.model.ModuleModel;

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
        List<ModelFieldModel> modelFields = this.getModel().getModelFields();
        List<ModelFieldModel> modelFieldList = new ArrayList<>();
        modelFields.forEach(modelField -> {
            if (modelField.getDataType().equals(DataTypeEnum.MODEL)) {
                modelFieldList.add(modelField);
            }
        });
        return modelFieldList;
    }

    public List<ModelFieldModel> getEnumList() {
        List<ModelFieldModel> modelFields = this.getModel().getModelFields();
        List<ModelFieldModel> modelFieldList = new ArrayList<>();
        modelFields.forEach(modelField -> {
            if (modelField.getDataType().equals(DataTypeEnum.ENUM)) {
                modelFieldList.add(modelField);
            }
        });
        return modelFieldList;
    }

    public static String getModelFieldType(ModelFieldModel modelField) {
        return DataTypeUtils.getModelDataType(modelField);
    }

    public static String getEntityFieldType(ModelFieldModel modelField) {
        return DataTypeUtils.getEntityDataType(modelField);
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

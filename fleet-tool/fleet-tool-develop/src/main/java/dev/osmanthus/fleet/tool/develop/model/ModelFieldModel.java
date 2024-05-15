package dev.osmanthus.fleet.tool.develop.model;

import dev.osmanthus.fleet.common.enumeration.DataTypeEnum;
import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.tool.develop.entity.ModelField;

public class ModelFieldModel extends AbstractModel<ModelField> {
    private String id;
    private String code;
    private String name;
    private DataTypeEnum dataType;
    private Integer dataLength;
    private EnumerationModel enumType;
    private ModelModel modelType;
    private Boolean isSlaveModel;
    private Boolean isNullable;
    private Boolean isSearchable;
    private Boolean isDefaultDisplay;
    private String note;
    private String sequence;
    private ModelModel model;

    public ModelFieldModel() {
    }

    public ModelFieldModel(ModelField modelField) {
        this.fromEntity(modelField);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public Integer getDataLength() {
        return dataLength;
    }

    public void setDataLength(Integer dataLength) {
        this.dataLength = dataLength;
    }

    public EnumerationModel getEnumType() {
        return enumType;
    }

    public void setEnumType(EnumerationModel enumType) {
        this.enumType = enumType;
    }

    public void setEnumType(String dataEnum) {
        if (dataEnum == null) {
            this.enumType = null;
        } else {
            EnumerationModel enumerationModel = new EnumerationModel();
            enumerationModel.setId(dataEnum);
            this.enumType = enumerationModel;
        }
    }

    public ModelModel getModelType() {
        return modelType;
    }

    public void setModelType(ModelModel modelType) {
        this.modelType = modelType;
    }

    public void setModelType(String dataModel) {
        if (dataModel == null) {
            this.modelType = null;
        } else {
            ModelModel modelModel = new ModelModel();
            modelModel.setId(dataModel);
            this.modelType = modelModel;
        }
    }

    public Boolean getIsSlaveModel() {
        return isSlaveModel;
    }

    public void setIsSlaveModel(Boolean isSlaveModel) {
        this.isSlaveModel = isSlaveModel;
    }

    public Boolean getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    public Boolean getIsSearchable() {
        return isSearchable;
    }

    public void setIsSearchable(Boolean isSearchable) {
        this.isSearchable = isSearchable;
    }

    public Boolean getIsDefaultDisplay() {
        return isDefaultDisplay;
    }

    public void setIsDefaultDisplay(Boolean isDefaultDisplay) {
        this.isDefaultDisplay = isDefaultDisplay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public ModelModel getModel() {
        return model;
    }

    public void setModel(ModelModel model) {
        this.model = model;
    }

    public void setModel(String model) {
        if (model == null) {
            this.model = null;
        } else {
            ModelModel modelModel = new ModelModel();
            modelModel.setId(model);
            this.model = modelModel;
        }
    }

    @Override
    public void fromEntity(ModelField modelField) {
        if (modelField == null) {
            return;
        }
        this.setId(modelField.getId());
        this.setCode(modelField.getCode());
        this.setName(modelField.getName());
        this.setDataType(DataTypeEnum.getByValue(modelField.getDataType()));
        this.setDataLength(modelField.getDataLength());
        this.setEnumType(modelField.getEnumType());
        this.setModelType(modelField.getModelType());
        this.setIsSlaveModel(modelField.getIsSlaveModel());
        this.setIsNullable(modelField.getIsNullable());
        this.setIsSearchable(modelField.getIsSearchable());
        this.setIsDefaultDisplay(modelField.getIsDefaultDisplay());
        this.setNote(modelField.getNote());
        this.setSequence(modelField.getSequence());
        this.setModel(modelField.getModel());
    }

    @Override
    public ModelField toEntity() {
        ModelField modelField = new ModelField();
        modelField.setId(this.getId());
        modelField.setCode(this.getCode());
        modelField.setName(this.getName());
        modelField.setDataType(this.getDataType().getValue());
        modelField.setDataLength(this.getDataLength());
        modelField.setIsSlaveModel(this.getIsSlaveModel());
        modelField.setIsNullable(this.getIsNullable());
        modelField.setIsSearchable(this.getIsSearchable());
        modelField.setIsDefaultDisplay(this.getIsDefaultDisplay());
        modelField.setNote(this.getNote());
        modelField.setSequence(this.getSequence());

        ModelModel modelType = this.getModelType();
        if (modelType != null) {
            modelField.setModelType(modelType.getId());
        }
        EnumerationModel enumType = this.getEnumType();
        if (enumType != null) {
            modelField.setEnumType(enumType.getId());
        }
        ModelModel model = this.getModel();
        if (model != null) {
            modelField.setModel(model.getId());
        }

        return modelField;
    }
}

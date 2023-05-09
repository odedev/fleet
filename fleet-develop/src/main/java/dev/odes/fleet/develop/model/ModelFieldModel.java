package dev.odes.fleet.develop.model;

import dev.odes.fleet.common.enumeration.DataTypeEnum;
import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.develop.entity.ModelField;

public class ModelFieldModel extends AbstractModel<ModelField> {
    private String id;
    private String code;
    private String name;
    private DataTypeEnum dataType;
    private Integer length;
    private String defaultValue;
    private EnumerationModel dataEnum;
    private ModelModel dataModel;
    private Boolean isNullable;
    private Boolean isSearchable;
    private Boolean isDefaultDisplay;
    private Boolean isSlaveModel;
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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public EnumerationModel getDataEnum() {
        return dataEnum;
    }

    public void setDataEnum(EnumerationModel dataEnum) {
        this.dataEnum = dataEnum;
    }

    public void setDataEnum(String dataEnum) {
        if (dataEnum == null) {
            this.dataEnum = null;
        } else {
            EnumerationModel enumerationModel = new EnumerationModel();
            enumerationModel.setId(dataEnum);
            this.dataEnum = enumerationModel;
        }
    }

    public ModelModel getDataModel() {
        return dataModel;
    }

    public void setDataModel(ModelModel dataModel) {
        this.dataModel = dataModel;
    }

    public void setDataModel(String dataModel) {
        if (dataModel == null) {
            this.dataModel = null;
        } else {
            ModelModel modelModel = new ModelModel();
            modelModel.setId(dataModel);
            this.dataModel = modelModel;
        }
    }

    public Boolean getNullable() {
        return isNullable;
    }

    public void setNullable(Boolean nullable) {
        isNullable = nullable;
    }

    public Boolean getSearchable() {
        return isSearchable;
    }

    public void setSearchable(Boolean searchable) {
        isSearchable = searchable;
    }

    public Boolean getDefaultDisplay() {
        return isDefaultDisplay;
    }

    public void setDefaultDisplay(Boolean defaultDisplay) {
        isDefaultDisplay = defaultDisplay;
    }

    public Boolean getSlaveModel() {
        return isSlaveModel;
    }

    public void setSlaveModel(Boolean slaveModel) {
        isSlaveModel = slaveModel;
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
        this.setLength(modelField.getLength());
        this.setDataEnum(modelField.getDataEnum());
        this.setDataModel(modelField.getDataModel());
        this.setModel(modelField.getModel());
    }

    @Override
    public ModelField toEntity() {
        ModelField modelField = new ModelField();
        modelField.setId(this.getId());
        modelField.setCode(this.getCode());
        modelField.setName(this.getName());
        modelField.setDataType(this.getDataType().getValue());
        modelField.setLength(this.getLength());

        ModelModel dataModel = this.getDataModel();
        EnumerationModel dataEnum = this.getDataEnum();
        ModelModel model = this.getModel();
        if (dataModel != null) {
            modelField.setDataModel(dataModel.getId());
        }
        if (dataEnum != null) {
            modelField.setDataEnum(dataEnum.getId());
        }
        if (model != null) {
            modelField.setModel(model.getId());
        }

        return modelField;
    }
}

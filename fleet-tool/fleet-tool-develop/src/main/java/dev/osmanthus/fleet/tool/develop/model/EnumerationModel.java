package dev.osmanthus.fleet.tool.develop.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.tool.develop.entity.Enumeration;

import java.util.List;

public class EnumerationModel extends AbstractModel<Enumeration> {
    private String id;
    private String code;
    private String name;
    private String fullName;
    private ModuleModel module;
    private List<EnumerationValueModel> values;

    public EnumerationModel() {
    }

    public EnumerationModel(Enumeration enumeration) {
        this.fromEntity(enumeration);
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ModuleModel getModule() {
        return module;
    }

    public void setModule(ModuleModel module) {
        this.module = module;
    }

    public List<EnumerationValueModel> getValues() {
        return values;
    }

    public void setValues(List<EnumerationValueModel> values) {
        this.values = values;
    }

    @Override
    public void fromEntity(Enumeration enumeration) {
        this.setId(enumeration.getId());
        this.setCode(enumeration.getCode());
        this.setName(enumeration.getName());
        this.setFullName(enumeration.getFullName());
    }

    @Override
    public Enumeration toEntity() {
        Enumeration enumeration = new Enumeration();
        enumeration.setId(this.getId());
        enumeration.setCode(this.getCode());
        enumeration.setName(this.getName());
        enumeration.setFullName(this.getFullName());
        return enumeration;
    }
}

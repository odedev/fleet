package dev.odes.fleet.develop.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.develop.entity.Enumeration;

import java.util.List;

/**
 * package: dev.odes.fleet.develop.model
 * class: EnumerationModel
 * date: 2023/5/6 21:06
 * version: 1.0.0
 * description:
 */
public class EnumerationModel extends AbstractModel<Enumeration> {
    private String id;
    private String code;
    private String name;
    private List<EnumerationValueModel> enumerationValues;

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

    public List<EnumerationValueModel> getEnumerationValues() {
        return enumerationValues;
    }

    public void setEnumerationValues(List<EnumerationValueModel> enumerationValues) {
        this.enumerationValues = enumerationValues;
    }

    @Override
    public void fromEntity(Enumeration enumeration) {
        this.setId(enumeration.getId());
        this.setCode(enumeration.getCode());
        this.setName(enumeration.getName());
    }

    @Override
    public Enumeration toEntity() {
        Enumeration enumeration = new Enumeration();
        enumeration.setId(this.getId());
        enumeration.setCode(this.getCode());
        enumeration.setName(this.getName());
        return enumeration;
    }
}

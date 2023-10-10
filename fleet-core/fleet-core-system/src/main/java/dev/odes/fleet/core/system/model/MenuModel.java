package dev.odes.fleet.core.system.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.core.system.entity.Menu;

public class MenuModel extends AbstractModel<Menu> {
    private String id;
    private String code;
    private String name;
    private String path;
    private String icon;
    private Integer sequence;
    private String parent;
    private String note;
    private Boolean isSystem;

    public MenuModel() {

    }

    public MenuModel(Menu menu) {
        this.fromEntity(menu);
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    @Override
    public void fromEntity(Menu menu) {

    }

    @Override
    public Menu toEntity() {
        return null;
    }
}

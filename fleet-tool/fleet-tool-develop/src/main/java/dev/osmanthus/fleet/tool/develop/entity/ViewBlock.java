package dev.osmanthus.fleet.tool.develop.entity;

import dev.osmanthus.fleet.common.entity.AbstractEntity;

public class ViewBlock extends AbstractEntity {
    private String id;
    private String view;
    private String model;
    private Integer blockType;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

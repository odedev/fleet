package dev.osmanthus.fleet.tool.develop.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.tool.develop.entity.ViewBlock;

public class ViewBlockModel extends AbstractModel<ViewBlock> {
    private String id;
    private ViewModel view;
    private ModelModel model;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public ViewModel getView() {
        return view;
    }

    public void setView(ViewModel view) {
        this.view = view;
    }

    public ModelModel getModel() {
        return model;
    }

    public void setModel(ModelModel model) {
        this.model = model;
    }

    @Override
    public void fromEntity(ViewBlock viewBlock) {

    }

    @Override
    public ViewBlock toEntity() {
        return null;
    }
}

package dev.osmanthus.fleet.tool.develop.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.tool.develop.entity.ViewBlock;
import dev.osmanthus.fleet.tool.develop.model.ViewBlockModel;
import org.springframework.stereotype.Component;

@Component
public class ViewBlockTransform implements Transform<ViewBlock, ViewBlockModel> {
    @Override
    public ViewBlockModel toModel(ViewBlock viewBlock) {
        ViewBlockModel viewBlockModel = new ViewBlockModel();

        return viewBlockModel;
    }

    @Override
    public ViewBlock toEntity(ViewBlockModel viewBlockModel) {
        return viewBlockModel.toEntity();
    }
}

package dev.odes.fleet.develop.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.develop.entity.ViewBlock;
import dev.odes.fleet.develop.model.ViewBlockModel;
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

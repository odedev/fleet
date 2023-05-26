package dev.odes.fleet.core.file.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.core.file.entity.StaticFile;
import dev.odes.fleet.core.file.model.StaticFileModel;
import org.springframework.stereotype.Component;

@Component
public class StaticFileTransform implements Transform<StaticFile, StaticFileModel> {
    @Override
    public StaticFileModel toModel(StaticFile staticFile) {
        StaticFileModel staticFileModel = new StaticFileModel(staticFile);
        return staticFileModel;
    }

    @Override
    public StaticFile toEntity(StaticFileModel staticFileModel) {
        return staticFileModel.toEntity();
    }
}

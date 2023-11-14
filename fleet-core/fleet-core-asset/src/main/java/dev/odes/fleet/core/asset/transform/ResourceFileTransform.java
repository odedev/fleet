package dev.odes.fleet.core.asset.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.core.asset.entity.ResourceFile;
import dev.odes.fleet.core.asset.model.ResourceFileModel;
import org.springframework.stereotype.Component;

@Component
public class ResourceFileTransform implements Transform<ResourceFile, ResourceFileModel> {
    @Override
    public ResourceFileModel toModel(ResourceFile resourceFile) {
        ResourceFileModel resourceFileModel = new ResourceFileModel(resourceFile);
        return resourceFileModel;
    }

    @Override
    public ResourceFile toEntity(ResourceFileModel resourceFileModel) {
        return resourceFileModel.toEntity();
    }
}

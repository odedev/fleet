package dev.osmanthus.fleet.core.asset.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.core.asset.entity.ResourceFile;
import dev.osmanthus.fleet.core.asset.enumeration.LocationEnum;
import dev.osmanthus.fleet.core.asset.model.ResourceFileModel;
import org.springframework.stereotype.Component;

@Component("dev.osmanthus.fleet.core.asset.transform.ResourceFileTransform")
public class ResourceFileTransform implements Transform<ResourceFile, ResourceFileModel> {

    @Override
    public ResourceFileModel toModel(ResourceFile resourceFile) {
        ResourceFileModel resourceFileModel = new ResourceFileModel();
        if (resourceFile != null) {
            resourceFileModel.setId(resourceFile.getId());
            resourceFileModel.setName(resourceFile.getName());
            resourceFileModel.setSize(resourceFile.getSize());
            resourceFileModel.setType(resourceFile.getType());
            resourceFileModel.setPath(resourceFile.getPath());
            resourceFileModel.setUrl(resourceFile.getUrl());
            resourceFileModel.setLocation(LocationEnum.getByValue(resourceFile.getLocation()));
            resourceFileModel.setDirectory(resourceFile.getDirectory());
            resourceFileModel.setCategory(resourceFile.getCategory());
            resourceFileModel.setStatus(resourceFile.getStatus());
            resourceFileModel.setScope(resourceFile.getScope());
        }
        return resourceFileModel;
    }

    @Override
    public ResourceFile toEntity(ResourceFileModel resourceFileModel) {
        ResourceFile resourceFile = new ResourceFile();
        if (resourceFileModel != null) {
            resourceFile.setId(resourceFileModel.getId());
            resourceFile.setName(resourceFileModel.getName());
            resourceFile.setSize(resourceFileModel.getSize());
            resourceFile.setType(resourceFileModel.getType());
            resourceFile.setPath(resourceFileModel.getPath());
            resourceFile.setUrl(resourceFileModel.getUrl());
            resourceFile.setLocation(resourceFileModel.getLocation().getValue());
            resourceFile.setDirectory(resourceFileModel.getDirectory());
            resourceFile.setCategory(resourceFileModel.getCategory());
            resourceFile.setStatus(resourceFileModel.getStatus());
            resourceFile.setScope(resourceFileModel.getScope());
        }
        return resourceFile;
    }
}

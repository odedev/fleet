package dev.odes.fleet.core.file.service;

import dev.odes.fleet.common.utils.IdUtils;
import dev.odes.fleet.core.file.dto.ResourceDto;
import dev.odes.fleet.core.file.dto.ResourceUploadDto;
import dev.odes.fleet.core.file.model.ResourceFileModel;
import dev.odes.fleet.core.file.repository.ResourceRepository;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {
    private final ResourceRepository resourceRepository;
    private final ResourceFileService staticFileService;
    public ResourceService(ResourceRepository resourceRepository, ResourceFileService staticFileService) {
        this.resourceRepository = resourceRepository;
        this.staticFileService = staticFileService;
    }

    public ResourceFileModel upload(ResourceUploadDto resourceUploadDto) {
        ResourceDto resourceDto = this.resourceRepository.upload(resourceUploadDto);
        if (resourceDto == null) {
            throw new RuntimeException("上传失败");
        }
        String category = resourceUploadDto.getCategory();
        ResourceFileModel staticFileModel = new ResourceFileModel();
        staticFileModel.setId(IdUtils.getId());
        staticFileModel.setName(resourceDto.getName());
        staticFileModel.setType(resourceDto.getType());
        staticFileModel.setSize(resourceDto.getSize());
        staticFileModel.setPath(resourceDto.getPath());
        staticFileModel.setUrl(resourceDto.getUrl());
        staticFileModel.setLocation(resourceDto.getLocation());
        staticFileModel.setDirectory(resourceDto.getDirectory());
        staticFileModel.setCategory(category);
        ResourceFileModel fileModel = this.staticFileService.insertOne(staticFileModel);
        return fileModel;
    }

    public void download() {

    }
}

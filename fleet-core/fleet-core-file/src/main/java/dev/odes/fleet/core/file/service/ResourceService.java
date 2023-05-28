package dev.odes.fleet.core.file.service;

import dev.odes.fleet.common.utils.IdUtils;
import dev.odes.fleet.core.file.dto.ResourceDto;
import dev.odes.fleet.core.file.dto.ResourceUploadDto;
import dev.odes.fleet.core.file.model.StaticFileModel;
import dev.odes.fleet.core.file.repository.ResourceRepository;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {
    private final ResourceRepository resourceRepository;
    private final StaticFileService staticFileService;
    public ResourceService(ResourceRepository resourceRepository, StaticFileService staticFileService) {
        this.resourceRepository = resourceRepository;
        this.staticFileService = staticFileService;
    }

    public StaticFileModel upload(ResourceUploadDto resourceUploadDto) {
        ResourceDto resourceDto = this.resourceRepository.upload(resourceUploadDto);
        if (resourceDto == null) {
            throw new RuntimeException("上传失败");
        }
        String category = resourceUploadDto.getCategory();
        StaticFileModel staticFileModel = new StaticFileModel();
        staticFileModel.setId(IdUtils.getId());
        staticFileModel.setName(resourceDto.getName());
        staticFileModel.setType(resourceDto.getType());
        staticFileModel.setSize(resourceDto.getSize());
        staticFileModel.setPath(resourceDto.getPath());
        staticFileModel.setUrl(resourceDto.getUrl());
        staticFileModel.setLocation(resourceDto.getLocation());
        staticFileModel.setFolder(resourceDto.getFolder());
        staticFileModel.setCategory(category);
        StaticFileModel fileModel = this.staticFileService.insertOne(staticFileModel);
        return fileModel;
    }

    public void download() {

    }
}

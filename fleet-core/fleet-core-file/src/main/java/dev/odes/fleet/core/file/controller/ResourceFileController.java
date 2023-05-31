package dev.odes.fleet.core.file.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.core.file.entity.ResourceFile;
import dev.odes.fleet.core.file.model.ResourceFileModel;
import dev.odes.fleet.core.file.repository.ResourceFileRepository;
import dev.odes.fleet.core.file.service.ResourceFileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/file/static_file")
public class ResourceFileController extends AbstractController<ResourceFile, ResourceFileModel, ResourceFileRepository, ResourceFileService> {
    private final ResourceFileService resourceFileService;
    public ResourceFileController(ResourceFileService resourceFileService) {
        super(resourceFileService);
        this.resourceFileService = resourceFileService;
    }
}

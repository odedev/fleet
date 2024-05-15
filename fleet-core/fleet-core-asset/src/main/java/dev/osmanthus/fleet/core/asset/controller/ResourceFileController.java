package dev.osmanthus.fleet.core.asset.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.core.asset.entity.ResourceFile;
import dev.osmanthus.fleet.core.asset.model.ResourceFileModel;
import dev.osmanthus.fleet.core.asset.repository.ResourceFileRepository;
import dev.osmanthus.fleet.core.asset.service.ResourceFileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("dev.osmanthus.fleet.core.asset.controller.ResourceFileController")
@RequestMapping(path = "/asset/resource_file")
public class ResourceFileController extends AbstractController<ResourceFile, ResourceFileModel, ResourceFileRepository, ResourceFileService> {
    private final ResourceFileService resourceFileService;
    public ResourceFileController(ResourceFileService resourceFileService) {
        super(resourceFileService);
        this.resourceFileService = resourceFileService;
    }
}

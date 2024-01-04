package dev.odes.fleet.core.asset.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.core.asset.entity.ResourceFile;
import dev.odes.fleet.core.asset.model.ResourceFileModel;
import dev.odes.fleet.core.asset.repository.ResourceFileRepository;
import dev.odes.fleet.core.asset.service.ResourceFileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("dev.odes.fleet.core.asset.controller.ResourceFileController")
@RequestMapping(path = "/asset/resource_file")
public class ResourceFileController extends AbstractController<ResourceFile, ResourceFileModel, ResourceFileRepository, ResourceFileService> {
    private final ResourceFileService resourceFileService;
    public ResourceFileController(ResourceFileService resourceFileService) {
        super(resourceFileService);
        this.resourceFileService = resourceFileService;
    }
}

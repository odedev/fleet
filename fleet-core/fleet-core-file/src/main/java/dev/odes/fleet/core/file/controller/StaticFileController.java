package dev.odes.fleet.core.file.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.core.file.entity.StaticFile;
import dev.odes.fleet.core.file.model.StaticFileModel;
import dev.odes.fleet.core.file.repository.StaticFileRepository;
import dev.odes.fleet.core.file.service.StaticFileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/file/static_file")
public class StaticFileController extends AbstractController<StaticFile, StaticFileModel, StaticFileRepository, StaticFileService> {
    private final StaticFileService staticFileService;
    public StaticFileController(StaticFileService staticFileService) {
        super(staticFileService);
        this.staticFileService = staticFileService;
    }
}

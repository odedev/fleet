package dev.osmanthus.fleet.tool.develop.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.tool.develop.entity.ViewBlock;
import dev.osmanthus.fleet.tool.develop.model.ViewBlockModel;
import dev.osmanthus.fleet.tool.develop.repository.ViewBlockRepository;
import dev.osmanthus.fleet.tool.develop.service.ViewBlockService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/view_block")
public class ViewBlockController extends AbstractController<ViewBlock, ViewBlockModel, ViewBlockRepository, ViewBlockService> {
    private final ViewBlockService viewBlockService;
    public ViewBlockController(ViewBlockService viewBlockService) {
        super(viewBlockService);
        this.viewBlockService = viewBlockService;
    }
}

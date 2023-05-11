package dev.odes.fleet.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.develop.entity.ViewBlock;
import dev.odes.fleet.develop.model.ViewBlockModel;
import dev.odes.fleet.develop.repository.ViewBlockRepository;
import dev.odes.fleet.develop.service.ViewBlockService;
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

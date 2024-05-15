package dev.osmanthus.fleet.tool.develop.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.tool.develop.entity.View;
import dev.osmanthus.fleet.tool.develop.model.ViewModel;
import dev.osmanthus.fleet.tool.develop.repository.ViewRepository;
import dev.osmanthus.fleet.tool.develop.service.ViewService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/view")
public class ViewController extends AbstractController<View, ViewModel, ViewRepository, ViewService> {
    private final ViewService viewService;

    public ViewController(ViewService viewService) {
        super(viewService);
        this.viewService = viewService;
    }
}

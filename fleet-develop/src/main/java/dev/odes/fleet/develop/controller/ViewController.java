package dev.odes.fleet.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.develop.entity.View;
import dev.odes.fleet.develop.model.ViewModel;
import dev.odes.fleet.develop.repository.ViewRepository;
import dev.odes.fleet.develop.service.ViewService;
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

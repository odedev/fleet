package dev.odes.fleet.tool.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.tool.develop.entity.AppModule;
import dev.odes.fleet.tool.develop.model.AppModuleModel;
import dev.odes.fleet.tool.develop.repository.AppModuleRepository;
import dev.odes.fleet.tool.develop.service.AppModuleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/app_module")
public class AppModuleController extends AbstractController<AppModule, AppModuleModel, AppModuleRepository, AppModuleService> {
    private final AppModuleService service;
    public AppModuleController(AppModuleService service) {
        super(service);
        this.service = service;
    }
}

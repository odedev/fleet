package dev.odes.fleet.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.develop.entity.Module;
import dev.odes.fleet.develop.model.ModuleModel;
import dev.odes.fleet.develop.repository.ModuleRepository;
import dev.odes.fleet.develop.service.ModuleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/module")
public class ModuleController extends AbstractController<Module, ModuleModel, ModuleRepository, ModuleService> {
    private final ModuleService moduleService;
    public ModuleController(ModuleService moduleService) {
        super(moduleService);
        this.moduleService = moduleService;
    }
}

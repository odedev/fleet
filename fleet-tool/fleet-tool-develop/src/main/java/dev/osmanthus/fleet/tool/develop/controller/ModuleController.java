package dev.osmanthus.fleet.tool.develop.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.tool.develop.entity.Module;
import dev.osmanthus.fleet.tool.develop.model.ModuleModel;
import dev.osmanthus.fleet.tool.develop.repository.ModuleRepository;
import dev.osmanthus.fleet.tool.develop.service.ModuleService;
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

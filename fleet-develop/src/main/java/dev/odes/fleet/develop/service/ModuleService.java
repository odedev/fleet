package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.develop.entity.Module;
import dev.odes.fleet.develop.model.ModuleModel;
import dev.odes.fleet.develop.repository.ModuleRepository;
import org.springframework.stereotype.Service;

@Service
public class ModuleService extends AbstractService<Module, ModuleModel, ModuleRepository> {
    private final ModuleRepository moduleRepository;

    ModuleService(ModuleRepository moduleRepository) {
        super(moduleRepository);
        this.moduleRepository = moduleRepository;
    }

    @Override
    public ModuleModel transform(Module module) {
        return null;
    }

    @Override
    public Module transform(ModuleModel moduleModel) {
        return null;
    }
}

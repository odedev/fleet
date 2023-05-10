package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.develop.entity.Module;
import dev.odes.fleet.develop.enumeration.ModuleTypeEnum;
import dev.odes.fleet.develop.enumeration.StorageTypeEnum;
import dev.odes.fleet.develop.model.ModuleModel;
import dev.odes.fleet.develop.repository.ModuleRepository;
import dev.odes.fleet.develop.transform.ModuleTransform;
import org.springframework.stereotype.Service;

@Service
public class ModuleService extends AbstractService<Module, ModuleModel, ModuleRepository> {
    private final ModuleTransform moduleTransform;
    private final ModuleRepository moduleRepository;

    public ModuleService(ModuleTransform moduleTransform, ModuleRepository moduleRepository) {
        super(moduleRepository);
        this.moduleTransform = moduleTransform;
        this.moduleRepository = moduleRepository;
    }

    @Override
    public ModuleModel transform(Module module) {
        return this.moduleTransform.toModel(module);
    }

    @Override
    public Module transform(ModuleModel moduleModel) {
        return this.moduleTransform.toEntity(moduleModel);
    }

    @Override
    public void setDefaultValue(ModuleModel moduleModel) {
        super.setDefaultValue(moduleModel);
    }

    @Override
    public void validate(ModuleModel moduleModel) {
        super.validate(moduleModel);
    }

    @Override
    public void beforeInsert(ModuleModel moduleModel) {
        super.beforeInsert(moduleModel);
        moduleModel.setStorageType(StorageTypeEnum.MYSQL);
    }
}

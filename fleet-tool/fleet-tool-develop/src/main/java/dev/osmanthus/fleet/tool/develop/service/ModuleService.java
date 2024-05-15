package dev.osmanthus.fleet.tool.develop.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.tool.develop.entity.Module;
import dev.osmanthus.fleet.tool.develop.enumeration.StorageTypeEnum;
import dev.osmanthus.fleet.tool.develop.model.ModuleModel;
import dev.osmanthus.fleet.tool.develop.repository.ModuleRepository;
import dev.osmanthus.fleet.tool.develop.transform.ModuleTransform;
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

package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.develop.entity.AppModule;
import dev.odes.fleet.develop.model.AppModuleModel;
import dev.odes.fleet.develop.repository.AppModuleRepository;
import org.springframework.stereotype.Service;

@Service
public class AppModuleService extends AbstractService<AppModule, AppModuleModel, AppModuleRepository> {
    private final AppModuleRepository repository;
    public AppModuleService(AppModuleRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public AppModuleModel transform(AppModule appModule) {
        return null;
    }

    @Override
    public AppModule transform(AppModuleModel appModuleModel) {
        return null;
    }

}

package dev.osmanthus.fleet.tool.develop.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.tool.develop.entity.AppModule;
import dev.osmanthus.fleet.tool.develop.model.AppModuleModel;
import dev.osmanthus.fleet.tool.develop.repository.AppModuleRepository;
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

package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.develop.entity.App;
import dev.odes.fleet.develop.model.AppModel;
import dev.odes.fleet.develop.repository.AppRepository;
import org.springframework.stereotype.Service;

@Service
public class AppService extends AbstractService<App, AppModel, AppRepository> {
    private final AppRepository appRepository;

    public AppService(AppRepository appRepository) {
        super(appRepository);
        this.appRepository = appRepository;
    }

    @Override
    public AppModel transform(App app) {
        return null;
    }

    @Override
    public App transform(AppModel appModel) {
        return null;
    }

}

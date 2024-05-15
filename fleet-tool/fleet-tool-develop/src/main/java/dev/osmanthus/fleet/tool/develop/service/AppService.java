package dev.osmanthus.fleet.tool.develop.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.tool.develop.entity.App;
import dev.osmanthus.fleet.tool.develop.model.AppModel;
import dev.osmanthus.fleet.tool.develop.repository.AppRepository;
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

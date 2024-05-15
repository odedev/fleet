package dev.osmanthus.fleet.tool.develop.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.tool.develop.entity.App;
import dev.osmanthus.fleet.tool.develop.model.AppModel;
import dev.osmanthus.fleet.tool.develop.repository.AppRepository;
import dev.osmanthus.fleet.tool.develop.service.AppService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/app")
public class AppController extends AbstractController<App, AppModel, AppRepository, AppService> {
    private final AppService appService;

    public AppController(AppService appService) {
        super(appService);
        this.appService = appService;
    }

}

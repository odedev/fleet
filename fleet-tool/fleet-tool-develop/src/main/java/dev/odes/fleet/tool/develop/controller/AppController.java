package dev.odes.fleet.tool.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.tool.develop.entity.App;
import dev.odes.fleet.tool.develop.model.AppModel;
import dev.odes.fleet.tool.develop.repository.AppRepository;
import dev.odes.fleet.tool.develop.service.AppService;
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

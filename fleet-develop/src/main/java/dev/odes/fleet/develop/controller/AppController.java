package dev.odes.fleet.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.common.parameter.Parameter;
import dev.odes.fleet.common.response.ResponseData;
import dev.odes.fleet.develop.entity.App;
import dev.odes.fleet.develop.model.AppModel;
import dev.odes.fleet.develop.repository.AppRepository;
import dev.odes.fleet.develop.service.AppService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/develop/app")
public class AppController extends AbstractController<App, AppModel, AppRepository, AppService> {
    private final AppService appService;

    public AppController(AppService appService) {
        super(appService);
        this.appService = appService;
    }

}

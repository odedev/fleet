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


    public AppController(AppService appService) {
        super(appService);
    }

    @Override
    public ResponseData findPage(Parameter parameter) {
        return null;
    }

    @Override
    public ResponseData findTree(Parameter parameter) {
        return null;
    }

    @Override
    public ResponseData findById(String id) {
        return null;
    }

    @Override
    public ResponseData insertOne(AppModel appModel) {
        return null;
    }

    @Override
    public ResponseData insertMany(List<AppModel> list) {
        return null;
    }

    @Override
    public ResponseData updateOne(AppModel appModel) {
        return null;
    }

    @Override
    public ResponseData updateMany(List<AppModel> list) {
        return null;
    }

    @Override
    public ResponseData deleteOne(AppModel appModel) {
        return null;
    }

    @Override
    public ResponseData deleteMany(List<AppModel> list) {
        return null;
    }

    @Override
    public Integer count(Parameter parameter) {
        return null;
    }
}

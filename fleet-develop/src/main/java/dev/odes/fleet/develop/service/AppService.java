package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.parameter.Parameter;
import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.develop.entity.App;
import dev.odes.fleet.develop.model.AppModel;
import dev.odes.fleet.develop.repository.AppRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService extends AbstractService<App, AppModel, AppRepository> {
    private final AppRepository appRepository;
    public AppService(AppRepository appRepository) {
        super(appRepository);
        this.appRepository = appRepository;
    }

    @Override
    public List<AppModel> findPage(Parameter parameter) {
        return null;
    }

    @Override
    public List<AppModel> findTree(Parameter parameter) {
        return null;
    }

    public AppModel findOne(Parameter parameter) {
        this.appRepository.findOne();
        return null;
    }

    @Override
    public AppModel findById(String id) {
        return null;
    }

    @Override
    public AppModel insertOne(AppModel appModel) {
        return null;
    }

    @Override
    public List<AppModel> insertMany(List<AppModel> list) {
        return null;
    }

    @Override
    public AppModel updateOne(AppModel appModel) {
        return null;
    }

    @Override
    public List<AppModel> updateMany(List<AppModel> list) {
        return null;
    }

    @Override
    public AppModel deleteOne(AppModel appModel) {
        return null;
    }

    @Override
    public List<AppModel> deleteMany(List<AppModel> list) {
        return null;
    }

    @Override
    public Integer count(Parameter parameter) {
        return null;
    }
}

package dev.odes.fleet.common.controller;

import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.common.parameter.Parameter;
import dev.odes.fleet.common.repository.Repository;
import dev.odes.fleet.common.response.ResponseData;
import dev.odes.fleet.common.service.AbstractService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public abstract class AbstractController<E extends AbstractEntity, M extends AbstractModel<E>, R extends Repository<E>, S extends AbstractService<E, M, R>> implements Controller<E, M> {
    private final S service;

    public AbstractController(S service) {
        this.service = service;
    }

    @Override
    @PostMapping(path = "/find")
    public ResponseData find(Parameter parameter) {
        List<M> mList = this.service.find(parameter);
        return null;
    }

    @Override
    @PostMapping(path = "/page")
    public ResponseData findPage(Parameter parameter) {
        return null;
    }

    @Override
    @PostMapping(path = "/tree")
    public ResponseData findTree(Parameter parameter) {
        return null;
    }

    @Override
    public ResponseData findById(String id) {
        return null;
    }

    @Override
    public ResponseData insertOne(M m) {
        return null;
    }

    @Override
    public ResponseData insertMany(List<M> list) {
        return null;
    }

    @Override
    public ResponseData updateOne(M m) {
        return null;
    }

    @Override
    public ResponseData updateMany(List<M> list) {
        return null;
    }

    @Override
    public ResponseData deleteOne(M m) {
        return null;
    }

    @Override
    public ResponseData deleteMany(List<M> list) {
        return null;
    }

    @Override
    public Integer count(Parameter parameter) {
        return null;
    }
}

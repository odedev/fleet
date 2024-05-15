package dev.osmanthus.fleet.common.controller;

import dev.osmanthus.fleet.common.entity.AbstractEntity;
import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.common.parameter.Parameter;
import dev.osmanthus.fleet.common.repository.Repository;
import dev.osmanthus.fleet.common.response.ResponseData;
import dev.osmanthus.fleet.common.service.AbstractService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class AbstractController<E extends AbstractEntity, M extends AbstractModel<E>, R extends Repository<E>, S extends AbstractService<E, M, R>> implements Controller<E, M> {
    private final S service;

    public AbstractController(S service) {
        this.service = service;
    }

    @Override
    @GetMapping(path = "/find/id/{id}")
    public ResponseData findById(@PathVariable("id") String id) {
        M m = this.service.findOneById(id);
        return new ResponseData(m);
    }

    @Override
    @PostMapping(path = "/find/one")
    public ResponseData findOne(@RequestBody Parameter parameter) {
        M m = this.service.findOne(parameter);
        return new ResponseData(m);
    }

    @Override
    @PostMapping(path = "/find/many")
    public ResponseData findMany(@RequestBody Parameter parameter) {
        List<M> mList = this.service.findMany(parameter);
        return new ResponseData(mList);
    }

    @Override
    @PostMapping(path = "/find/page")
    public ResponseData findPage(@RequestBody Parameter parameter) {
        List<M> mList = this.service.findPage(parameter);
        return new ResponseData(mList);
    }

    @Override
    @PostMapping(path = "/find/tree")
    public ResponseData findTree(@RequestBody Parameter parameter) {
        List<M> mList = this.service.findTree(parameter);
        return new ResponseData(mList);
    }

    @Override
    @Transactional
    @PostMapping(path = "/insert/one")
    public ResponseData insertOne(@RequestBody M m) {
        M one = this.service.insertOne(m);
        return new ResponseData(one);
    }

    @Override
    @Transactional
    @PostMapping(path = "/insert/many")
    public ResponseData insertMany(@RequestBody List<M> list) {
        List<M> mList = this.service.insertMany(list);
        return new ResponseData(mList);
    }

    @Override
    @Transactional
    @PostMapping(path = "/update/one")
    public ResponseData updateOne(@RequestBody M m) {
        M one = this.service.updateOne(m);
        return new ResponseData(one);
    }

    @Override
    @Transactional
    @PostMapping(path = "/update/many")
    public ResponseData updateMany(@RequestBody List<M> list) {
        List<M> mList = this.service.updateMany(list);
        return new ResponseData(mList);
    }

    @Override
    @Transactional
    @PostMapping(path = "/delete/one")
    public ResponseData deleteOne(@RequestBody M m) {
        M one = this.service.deleteOne(m);
        return new ResponseData(one);
    }

    @Override
    @Transactional
    @PostMapping(path = "/delete/many")
    public ResponseData deleteMany(@RequestBody List<M> list) {
        List<M> mList = this.service.deleteMany(list);
        return new ResponseData(mList);
    }

    @Override
    @PostMapping(path = "/count")
    public ResponseData count(@RequestBody Parameter parameter) {
        Integer count = this.service.count(parameter);
        return new ResponseData(count);
    }
}

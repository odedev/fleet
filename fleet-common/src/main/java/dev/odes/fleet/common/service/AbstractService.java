package dev.odes.fleet.common.service;

import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.common.parameter.Parameter;
import dev.odes.fleet.common.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractService<E extends AbstractEntity, M extends AbstractModel<E>, R extends Repository<E>> implements Service<E, M> {
    private final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    public abstract M transform(E e);
    public abstract E transform(M m);

    @Override
    public List<M> find(Parameter parameter) {
        List<E> eList = this.repository.find(parameter);
        List<M> mList = new ArrayList<>();
        eList.forEach(e -> mList.add(transform(e)));
        return mList;
    }

    @Override
    public List<M> findPage(Parameter parameter) {
        return null;
    }

    @Override
    public List<M> findTree(Parameter parameter) {
        return null;
    }

    @Override
    public M findOne(Parameter parameter) {
        return null;
    }

    @Override
    public M findById(String id) {
        return null;
    }

    @Override
    public M insertOne(M m) {
        return null;
    }

    @Override
    public List<M> insertMany(List<M> list) {
        return null;
    }

    @Override
    public M updateOne(M m) {
        return null;
    }

    @Override
    public List<M> updateMany(List<M> list) {
        return null;
    }

    @Override
    public M deleteOne(M m) {
        return null;
    }

    @Override
    public List<M> deleteMany(List<M> list) {
        return null;
    }

    @Override
    public Integer count(Parameter parameter) {
        return null;
    }
}

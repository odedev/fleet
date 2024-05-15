package dev.osmanthus.fleet.common.service;

import dev.osmanthus.fleet.common.entity.AbstractEntity;
import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.common.parameter.Parameter;
import dev.osmanthus.fleet.common.repository.Repository;
import dev.osmanthus.fleet.common.utils.IdUtils;
import dev.osmanthus.fleet.common.utils.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class AbstractService<E extends AbstractEntity, M extends AbstractModel<E>, R extends Repository<E>> implements Service<E, M> {
    private final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    public abstract M transform(E e);
    public abstract E transform(M m);

    @Override
    public List<M> findMany(Parameter parameter) {
        List<E> eList = this.repository.findMany(parameter);
        List<M> mList = new ArrayList<>();
        eList.forEach(e -> mList.add(transform(e)));
        return mList;
    }

    @Override
    public List<M> findPage(Parameter parameter) {
        List<E> eList = this.repository.findPage(parameter);
        List<M> mList = new ArrayList<>();
        eList.forEach(e -> mList.add(transform(e)));
        return mList;
    }

    @Override
    public List<M> findTree(Parameter parameter) {
        List<E> eList = this.repository.findMany(parameter);
        List<M> mList = new ArrayList<>();
        eList.forEach(e -> mList.add(transform(e)));
        // TODO TREE 结构

        Map<String, M> map = mList.stream().collect(Collectors.toMap(M::getId, m -> m));

        return mList;
    }

    @Override
    public M findOne(Parameter parameter) {
        E e = this.repository.findOne(parameter);
        return this._transform(e);
    }

    @Override
    public M findOneById(String id) {
        E e = this.repository.findOneById(id);
        return this._transform(e);
    }

    @Override
    public List<M> findManyById(String field, String id){
        List<E> eList = this.repository.findManyById(field, id);
        List<M> mList = new ArrayList<>();
        eList.forEach(e -> mList.add(transform(e)));
        return mList;
    }


    @Override
    public M insertOne(M m) {
        this._beforeInsert(m);
        E e = this._transform(m);
        this._beforeInsert(e);
        this.repository.insertOne(e);
        this._inserted(m);
        return m;
    }

    @Override
    public List<M> insertMany(List<M> list) {
        List<E> eList = new ArrayList<>();
        list.forEach(m -> {
            this._beforeInsert(m);
            E e = this._transform(m);
            this._beforeInsert(e);
            eList.add(e);
        });
        this.repository.insertMany(eList);
        list.forEach(m -> {
            this._inserted(m);
        });
        return list;
    }

    @Override
    public M updateOne(M m) {
        this._beforeUpdate(m);
        E e = this._transform(m);
        this._beforeUpdate(e);
        this.repository.updateOne(e);
        this._updated(m);
        return m;
    }

    @Override
    public List<M> updateMany(List<M> list) {
        List<E> eList = new ArrayList<>();
        list.forEach(m -> {
            this._beforeUpdate(m);
            E e = this._transform(m);
            this._beforeUpdate(e);
            eList.add(e);
        });
        this.repository.updateMany(eList);
        list.forEach(m -> {
            this._updated(m);
        });
        return list;
    }

    @Override
    public M deleteOne(M m) {
        this._beforeDelete(m);
        E e = this._transform(m);
        this.repository.deleteOne(e);
        this._deleted(m);
        return m;
    }

    @Override
    public List<M> deleteMany(List<M> list) {
        List<E> eList = new ArrayList<>();
        list.forEach(m -> {
            this._beforeDelete(m);
            eList.add(this._transform(m));
        });
        this.repository.deleteMany(eList);
        list.forEach(m -> {
            this._deleted(m);
        });
        return list;
    }

    @Override
    public Integer count(Parameter parameter) {
        return this.repository.count(parameter);
    }

    private M _transform(E e) {
        if (e == null) {
            return null;
        }
        return this.transform(e);
    }

    private E _transform(M m) {
        if (m == null) {
            return null;
        }
        return this.transform(m);
    }

    private void _setDefaultValue(M m) {
        this.setDefaultValue(m);
    }

    private void _validate(M m) {
        this.validate(m);
    }

    private void _beforeInsert(M m) {
        this._setDefaultValue(m);
        this._validate(m);
        this.beforeInsert(m);
        if (StringUtils.isNullOrEmpty(m.getId())) {
            m.setId(IdUtils.getId());
        }
    }

    private void _beforeUpdate(M m) {
        this._validate(m);
        this.beforeUpdate(m);
    }

    private void _beforeDelete(M m) {
        this.beforeDelete(m);
    }

    private void _inserted(M m) {
        this.inserted(m);
    }

    private void _updated(M m) {
        this.updated(m);
    }

    private void _deleted(M m) {
        this.deleted(m);
    }

    private void _beforeInsert(E e) {
        e.setCreatedAt(new Date());
    }

    private void _beforeUpdate(E e) {
        e.setUpdatedAt(new Date());
    }
}

package dev.odes.fleet.common.service;

import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.common.parameter.Parameter;

import java.util.List;

public interface Service<E extends AbstractEntity, M extends AbstractModel<E>> {
    List<M> find(Parameter parameter);
    List<M> findPage(Parameter parameter);
    List<M> findTree(Parameter parameter);
    M findOne(Parameter parameter);
    M findById(String id);

    M insertOne(M m);
    List<M> insertMany(List<M> list);

    M updateOne(M m);
    List<M> updateMany(List<M> list);

    M deleteOne(M m);
    List<M> deleteMany(List<M> list);

    Integer count(Parameter parameter);

}

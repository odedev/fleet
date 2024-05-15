package dev.osmanthus.fleet.common.service;

import dev.osmanthus.fleet.common.entity.AbstractEntity;
import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.common.parameter.Parameter;

import java.util.List;

public interface Service<E extends AbstractEntity, M extends AbstractModel<E>> {
    List<M> findMany(Parameter parameter);
    List<M> findPage(Parameter parameter);
    List<M> findTree(Parameter parameter);
    M findOne(Parameter parameter);
    M findOneById(String id);
    List<M> findManyById(String field, String id);

    M insertOne(M m);
    List<M> insertMany(List<M> list);

    M updateOne(M m);
    List<M> updateMany(List<M> list);

    M deleteOne(M m);
    List<M> deleteMany(List<M> list);

    Integer count(Parameter parameter);

    default void setDefaultValue(M m) {}
    default void validate(M m) {}
    default void beforeInsert(M m){}
    default void beforeUpdate(M m) {}
    default void beforeDelete(M m) {}
    default void inserted(M m) {}
    default void updated(M m) {}
    default void deleted(M m) {}

}

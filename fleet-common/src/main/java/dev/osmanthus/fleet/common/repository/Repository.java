package dev.osmanthus.fleet.common.repository;

import dev.osmanthus.fleet.common.entity.AbstractEntity;
import dev.osmanthus.fleet.common.parameter.Parameter;

import java.util.List;

public interface Repository<E extends AbstractEntity> {
    E findOne(Parameter parameter);
    List<E> findMany(Parameter parameter);
    List<E> findPage(Parameter parameter);
    E findOneById(String id);
    List<E> findManyById(String field, String id);

    E insertOne(E e);
    List<E> insertMany(List<E> list);

    E updateOne(E e);
    List<E> updateMany(List<E> list);

    E deleteOne(E e);
    List<E> deleteMany(List<E> list);

    Integer count(Parameter parameter);
}

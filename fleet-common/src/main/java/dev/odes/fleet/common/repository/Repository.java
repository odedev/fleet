package dev.odes.fleet.common.repository;

import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.parameter.Parameter;

import java.util.List;

public interface Repository<E extends AbstractEntity> {
    List<E> find(Parameter parameter);
    List<E> findPage(Parameter parameter);
    E findOne(Parameter parameter);
    E findById(String id);

    E insert(E e);
    List<E> insert(List<E> list);

    E update(E e);
    List<E> update(List<E> list);

    E delete(E e);
    List<E> delete(List<E> list);

    Integer count(Parameter parameter);
}

package dev.odes.fleet.common.service;

import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.common.parameter.Parameter;

import java.util.List;

public abstract class AbstractService<E extends AbstractEntity, M extends AbstractModel<E>, R extends dev.odes.fleet.common.repository.Repository<E>> implements Service<E, M> {
    private final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public List<M> find(Parameter parameter) {
        List<E> eList = this.repository.find(parameter);
        System.out.println(eList);
        return null;
    }
}

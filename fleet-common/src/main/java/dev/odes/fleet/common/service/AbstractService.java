package dev.odes.fleet.common.service;

import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.model.AbstractModel;

public abstract class AbstractService<E extends AbstractEntity, M extends AbstractModel<E>, R extends dev.odes.fleet.common.repository.Repository<E>> implements Service<E, M> {
    private final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }
}

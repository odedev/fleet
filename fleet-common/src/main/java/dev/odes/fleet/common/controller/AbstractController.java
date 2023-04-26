package dev.odes.fleet.common.controller;

import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.common.service.AbstractService;

public abstract class AbstractController<E extends AbstractEntity, M extends AbstractModel<E>, R extends dev.odes.fleet.common.repository.Repository<E>, S extends AbstractService<E, M, R>> implements Controller<E, M> {
    private final S service;

    public AbstractController(S service) {
        this.service = service;
    }
}

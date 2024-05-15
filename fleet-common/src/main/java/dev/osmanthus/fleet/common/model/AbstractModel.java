package dev.osmanthus.fleet.common.model;

import dev.osmanthus.fleet.common.entity.AbstractEntity;

import java.io.Serializable;

public abstract class AbstractModel<E extends AbstractEntity> implements Model<E>, Serializable {
    private static final long serial = 1L;

    @Override
    public E toEntity() {
        return null;
    }

    @Override
    public void fromEntity(E e) {

    }
}

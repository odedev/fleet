package dev.osmanthus.fleet.common.model;

import dev.osmanthus.fleet.common.entity.AbstractEntity;

public interface Model<E extends AbstractEntity> {
    String getId();
    void setId(String id);

    void fromEntity(E e);
    E toEntity();
}

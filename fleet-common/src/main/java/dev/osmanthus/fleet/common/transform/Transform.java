package dev.osmanthus.fleet.common.transform;

import dev.osmanthus.fleet.common.entity.AbstractEntity;
import dev.osmanthus.fleet.common.model.AbstractModel;

/**
 * package: dev.osmanthus.fleet.common.transform
 * class: Transform
 * date: 2023/5/7 13:35
 * version: 1.0.0
 * description:
 */
public interface Transform<E extends AbstractEntity, M extends AbstractModel<E>> {
    M toModel(E e);
    E toEntity(M m);
}

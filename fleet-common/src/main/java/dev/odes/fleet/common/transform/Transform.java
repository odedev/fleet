package dev.odes.fleet.common.transform;

import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.model.AbstractModel;

/**
 * package: dev.odes.fleet.common.transform
 * class: Transform
 * date: 2023/5/7 13:35
 * version: 1.0.0
 * description:
 */
public interface Transform<E extends AbstractEntity, M extends AbstractModel<E>> {
    M toModel(E e);
    E toEntity(M m);
}

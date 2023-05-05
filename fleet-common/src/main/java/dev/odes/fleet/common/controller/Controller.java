package dev.odes.fleet.common.controller;

import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.common.parameter.Parameter;
import dev.odes.fleet.common.response.ResponseData;

import java.util.List;

public interface Controller<E extends AbstractEntity, M extends AbstractModel<E>> {

    ResponseData findById(String id);

    ResponseData findOne(Parameter parameter);

    ResponseData findMany(Parameter parameter);

    ResponseData findPage(Parameter parameter);

    ResponseData findTree(Parameter parameter);

    ResponseData insertOne(M m);

    ResponseData insertMany(List<M> list);

    ResponseData updateOne(M m);

    ResponseData updateMany(List<M> list);

    ResponseData deleteOne(M m);

    ResponseData deleteMany(List<M> list);

    Integer count(Parameter parameter);
}

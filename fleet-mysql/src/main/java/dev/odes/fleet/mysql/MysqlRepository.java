package dev.odes.fleet.mysql;

import com.github.pagehelper.PageHelper;
import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.parameter.Parameter;
import dev.odes.fleet.common.repository.Repository;
import dev.odes.fleet.common.utils.StringUtils;

import java.util.List;

public class MysqlRepository<E extends AbstractEntity, M extends GenericMapper<E>> implements Repository<E> {
    private final M mapper;

    public MysqlRepository(M mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<E> findMany(Parameter parameter) {
        String where = ParameterConvert.toWhere(parameter);
        String order = "";
        return this.mapper.find(where, order);
    }

    @Override
    public List<E> findPage(Parameter parameter) {
        String where = "";
        String order = "";
        Integer pageNum = 1;
        Integer pageSize = 3;
        PageHelper.startPage(pageNum.intValue(), pageSize.intValue());
        return this.mapper.find(where, order);
    }

    @Override
    public E findOne(Parameter parameter) {
        String where = "";
        return this.mapper.findOne(where);
    }

    @Override
    public E findOneById(String id) {
        if (StringUtils.isNullOrEmpty(id)) {
            return null;
        }
        String where = "id=" + id;
        return this.mapper.findOne(where);
    }

    @Override
    public List<E> findManyById(String field, String id) {
        String where = field + "=" + id;
        String order = "";
        return this.mapper.find(where, order);
    }

    @Override
    public E insertOne(E e) {
        this.mapper.insertOne(e);
        return null;
    }

    @Override
    public List<E> insertMany(List<E> list) {
        list.forEach(this.mapper::insertOne);
        return null;
    }

    @Override
    public E updateOne(E e) {
        this.mapper.updateOne(e);
        return null;
    }

    @Override
    public List<E> updateMany(List<E> list) {
        list.forEach(this.mapper::updateOne);
        return null;
    }

    @Override
    public E deleteOne(E e) {
        String id = e.getId();
        this.mapper.deleteOne(id);
        return null;
    }

    @Override
    public List<E> deleteMany(List<E> list) {
        list.forEach(e -> this.mapper.deleteOne(e.getId()));
        return null;
    }

    @Override
    public Integer count(Parameter parameter) {
        String where = "";
        return this.mapper.count(where);
    }
}

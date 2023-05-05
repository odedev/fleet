package dev.odes.fleet.mysql;

import com.github.pagehelper.PageHelper;
import dev.odes.fleet.common.entity.AbstractEntity;
import dev.odes.fleet.common.parameter.Parameter;
import dev.odes.fleet.common.repository.Repository;

import java.util.List;

public class MysqlRepository<E extends AbstractEntity, M extends GenericMapper<E>> implements Repository<E> {
    private final M mapper;

    public MysqlRepository(M mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<E> find(Parameter parameter) {
        String where = "";
        String order = "";
        return this.mapper.find(where, order);
    }

    @Override
    public List<E> findPage(Parameter parameter) {
        String where = "";
        String order = "";
        Integer pageNum = 1;
        Integer pageSize = 10;
        PageHelper.startPage(pageNum.intValue(), pageSize.intValue());
        return this.mapper.find(where, order);
    }

    @Override
    public E findOne(Parameter parameter) {
        String where = "";
        return this.mapper.findOne(where);
    }

    @Override
    public E findById(String id) {
        if (id == null || id.isEmpty()) {
            return null;
        }
        String where = "id=" + id;
        return this.mapper.findOne(where);
    }

    @Override
    public E insertOne(E e) {
        this.mapper.insertOne(e);
        return e;
    }

    @Override
    public List<E> insert(List<E> list) {
        return null;
    }

    @Override
    public E updateOne(E e) {
        this.mapper.updateOne(e);
        return null;
    }

    @Override
    public List<E> update(List<E> list) {
        return null;
    }

    @Override
    public E deleteOne(E e) {
        this.mapper.deleteOne(e);
        return null;
    }

    @Override
    public List<E> delete(List<E> list) {
        return null;
    }

    @Override
    public Integer count(Parameter parameter) {
        String where = "";
        return this.mapper.count(where);
    }
}

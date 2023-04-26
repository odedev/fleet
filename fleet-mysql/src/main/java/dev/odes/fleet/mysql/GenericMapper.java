package dev.odes.fleet.mysql;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GenericMapper<T> {
    public List<T> find(@Param("where") String where, @Param("order") String order);
    public T findOne(@Param("where") String where);

    public void insert(List<T> list);
    public void insertOne(T t);

    public void updateOne(T t);

    public void deleteOne(T t);

    public Integer count(@Param("where") String where);
}

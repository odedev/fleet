package dev.osmanthus.fleet.component.mysql;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GenericMapper<T> {
    public T findOne(@Param("where") String where);
    public List<T> findMany(@Param("where") String where, @Param("order") String order);

    public void insertOne(T t);
    public void insertMany(List<T> list);

    public void updateOne(T t);

    public void deleteOne(@Param("id") String id);

    public Integer count(@Param("where") String where);
}

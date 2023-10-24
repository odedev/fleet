package dev.odes.fleet.develop.mapper;

import dev.odes.fleet.develop.entity.Model;
import dev.odes.fleet.database.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModelMapper extends GenericMapper<Model> {
}

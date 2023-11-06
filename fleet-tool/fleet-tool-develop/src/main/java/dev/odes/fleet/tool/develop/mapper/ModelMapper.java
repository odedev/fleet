package dev.odes.fleet.tool.develop.mapper;

import dev.odes.fleet.tool.develop.entity.Model;
import dev.odes.fleet.database.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModelMapper extends GenericMapper<Model> {
}

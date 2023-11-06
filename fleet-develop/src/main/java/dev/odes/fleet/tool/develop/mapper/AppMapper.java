package dev.odes.fleet.tool.develop.mapper;

import dev.odes.fleet.tool.develop.entity.App;
import dev.odes.fleet.database.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppMapper extends GenericMapper<App> {
}

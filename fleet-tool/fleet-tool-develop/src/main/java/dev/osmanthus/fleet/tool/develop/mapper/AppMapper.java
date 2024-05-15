package dev.osmanthus.fleet.tool.develop.mapper;

import dev.osmanthus.fleet.tool.develop.entity.App;
import dev.osmanthus.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppMapper extends GenericMapper<App> {
}

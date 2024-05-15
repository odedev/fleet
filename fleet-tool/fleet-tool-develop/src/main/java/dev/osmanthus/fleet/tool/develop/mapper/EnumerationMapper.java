package dev.osmanthus.fleet.tool.develop.mapper;

import dev.osmanthus.fleet.tool.develop.entity.Enumeration;
import dev.osmanthus.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnumerationMapper extends GenericMapper<Enumeration> {
}

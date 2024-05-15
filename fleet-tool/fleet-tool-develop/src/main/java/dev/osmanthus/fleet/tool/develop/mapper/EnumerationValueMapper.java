package dev.osmanthus.fleet.tool.develop.mapper;

import dev.osmanthus.fleet.tool.develop.entity.EnumerationValue;
import dev.osmanthus.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnumerationValueMapper extends GenericMapper<EnumerationValue> {
}

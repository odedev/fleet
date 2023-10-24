package dev.odes.fleet.develop.mapper;

import dev.odes.fleet.develop.entity.Enumeration;
import dev.odes.fleet.database.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnumerationMapper extends GenericMapper<Enumeration> {
}

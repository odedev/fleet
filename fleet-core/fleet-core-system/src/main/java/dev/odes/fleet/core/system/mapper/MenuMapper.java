package dev.odes.fleet.core.system.mapper;

import dev.odes.fleet.core.system.entity.Menu;
import dev.odes.fleet.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper extends GenericMapper<Menu> {
}

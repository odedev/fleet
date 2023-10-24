package dev.odes.fleet.core.system.mapper;

import dev.odes.fleet.core.system.entity.RoleMenu;
import dev.odes.fleet.database.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMenuMapper extends GenericMapper<RoleMenu> {
}

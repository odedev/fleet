package dev.osmanthus.fleet.core.system.mapper;

import dev.osmanthus.fleet.core.system.entity.RoleMenu;
import dev.osmanthus.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMenuMapper extends GenericMapper<RoleMenu> {
}

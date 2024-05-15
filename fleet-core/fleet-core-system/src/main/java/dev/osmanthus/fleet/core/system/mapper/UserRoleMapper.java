package dev.osmanthus.fleet.core.system.mapper;

import dev.osmanthus.fleet.core.system.entity.UserRole;
import dev.osmanthus.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper extends GenericMapper<UserRole> {
}

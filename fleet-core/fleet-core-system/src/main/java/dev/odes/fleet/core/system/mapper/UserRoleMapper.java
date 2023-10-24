package dev.odes.fleet.core.system.mapper;

import dev.odes.fleet.core.system.entity.UserRole;
import dev.odes.fleet.database.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper extends GenericMapper<UserRole> {
}

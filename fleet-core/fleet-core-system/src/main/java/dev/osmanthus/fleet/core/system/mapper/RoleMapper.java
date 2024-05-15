package dev.osmanthus.fleet.core.system.mapper;

import dev.osmanthus.fleet.core.system.entity.Role;
import dev.osmanthus.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("dev.osmanthus.fleet.core.system.mapper.RoleMapper")
public interface RoleMapper extends GenericMapper<Role> {
}

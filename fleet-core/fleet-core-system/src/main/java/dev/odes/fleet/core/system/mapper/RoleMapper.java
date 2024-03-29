package dev.odes.fleet.core.system.mapper;

import dev.odes.fleet.core.system.entity.Role;
import dev.odes.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("dev.odes.fleet.core.system.mapper.RoleMapper")
public interface RoleMapper extends GenericMapper<Role> {
}

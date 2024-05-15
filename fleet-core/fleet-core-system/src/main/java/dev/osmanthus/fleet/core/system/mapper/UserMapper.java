package dev.osmanthus.fleet.core.system.mapper;

import dev.osmanthus.fleet.core.system.entity.User;
import dev.osmanthus.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("dev.osmanthus.fleet.core.system.mapper.UserMapper")
public interface UserMapper extends GenericMapper<User> {
}

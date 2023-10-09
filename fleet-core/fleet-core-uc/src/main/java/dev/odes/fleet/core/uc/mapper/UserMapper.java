package dev.odes.fleet.core.uc.mapper;

import dev.odes.fleet.core.uc.entity.User;
import dev.odes.fleet.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends GenericMapper<User> {
}

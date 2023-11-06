package dev.odes.fleet.core.system.repository;

import dev.odes.fleet.core.system.entity.User;
import dev.odes.fleet.core.system.mapper.UserMapper;
import dev.odes.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends MysqlRepository<User, UserMapper> {
    private final UserMapper userMapper;

    public UserRepository(UserMapper userMapper) {
        super(userMapper);
        this.userMapper = userMapper;
    }
}

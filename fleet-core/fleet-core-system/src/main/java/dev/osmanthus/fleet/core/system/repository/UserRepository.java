package dev.osmanthus.fleet.core.system.repository;

import dev.osmanthus.fleet.core.system.entity.User;
import dev.osmanthus.fleet.core.system.mapper.UserMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository("dev.osmanthus.fleet.core.system.repository.UserRepository")
public class UserRepository extends MysqlRepository<User, UserMapper> {
    private final UserMapper userMapper;

    public UserRepository(UserMapper userMapper) {
        super(userMapper);
        this.userMapper = userMapper;
    }
}

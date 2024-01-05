package dev.odes.fleet.core.system.repository;

import dev.odes.fleet.component.mysql.MysqlRepository;
import dev.odes.fleet.core.system.entity.Role;
import dev.odes.fleet.core.system.mapper.RoleMapper;
import org.springframework.stereotype.Repository;

@Repository("dev.odes.fleet.core.system.repository.RoleRepository")
public class RoleRepository extends MysqlRepository<Role, RoleMapper> {
    private final RoleMapper roleMapper;

    public RoleRepository(RoleMapper roleMapper) {
        super(roleMapper);
        this.roleMapper = roleMapper;
    }
}

package dev.osmanthus.fleet.core.system.repository;

import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import dev.osmanthus.fleet.core.system.entity.Role;
import dev.osmanthus.fleet.core.system.mapper.RoleMapper;
import org.springframework.stereotype.Repository;

@Repository("dev.osmanthus.fleet.core.system.repository.RoleRepository")
public class RoleRepository extends MysqlRepository<Role, RoleMapper> {
    private final RoleMapper roleMapper;

    public RoleRepository(RoleMapper roleMapper) {
        super(roleMapper);
        this.roleMapper = roleMapper;
    }
}

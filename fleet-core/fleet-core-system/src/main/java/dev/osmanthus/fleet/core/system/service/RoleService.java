package dev.osmanthus.fleet.core.system.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.core.system.entity.Role;
import dev.osmanthus.fleet.core.system.model.RoleModel;
import dev.osmanthus.fleet.core.system.repository.RoleRepository;
import dev.osmanthus.fleet.core.system.transform.RoleTransform;
import org.springframework.stereotype.Service;

@Service("dev.osmanthus.fleet.core.system.service.RoleService")
public class RoleService extends AbstractService<Role, RoleModel, RoleRepository> {
    private final RoleTransform roleTransform;
    private final RoleRepository roleRepository;

    public RoleService(RoleTransform roleTransform, RoleRepository roleRepository) {
        super(roleRepository);
        this.roleTransform = roleTransform;
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleModel transform(Role role) {
        return this.roleTransform.toModel(role);
    }

    @Override
    public Role transform(RoleModel roleModel) {
        return this.roleTransform.toEntity(roleModel);
    }

    @Override
    public void setDefaultValue(RoleModel roleModel) {
    }

    @Override
    public void validate(RoleModel roleModel) {
    }

    @Override
    public void beforeInsert(RoleModel roleModel) {
    }

    @Override
    public void beforeUpdate(RoleModel roleModel) {
    }

    @Override
    public void beforeDelete(RoleModel roleModel) {
    }

    @Override
    public void inserted(RoleModel roleModel) {
    }

    @Override
    public void updated(RoleModel roleModel) {
    }

    @Override
    public void deleted(RoleModel roleModel) {
    }
}

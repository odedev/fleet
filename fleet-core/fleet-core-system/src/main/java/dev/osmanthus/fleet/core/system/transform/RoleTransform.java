package dev.osmanthus.fleet.core.system.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.core.system.entity.Role;
import dev.osmanthus.fleet.core.system.model.RoleModel;
import org.springframework.stereotype.Component;

@Component("dev.osmanthus.fleet.core.system.transform.RoleTransform")
public class RoleTransform implements Transform<Role, RoleModel> {

    @Override
    public RoleModel toModel(Role role) {
        RoleModel roleModel = new RoleModel();
        if (role != null) {
            roleModel.setId(role.getId());
            roleModel.setCode(role.getCode());
            roleModel.setName(role.getName());
            roleModel.setNote(role.getNote());
            roleModel.setIsSystem(role.getIsSystem());
        }
        return roleModel;
    }

    @Override
    public Role toEntity(RoleModel roleModel) {
        Role role = new Role();
        if (roleModel != null) {
            role.setId(roleModel.getId());
            role.setCode(roleModel.getCode());
            role.setName(roleModel.getName());
            role.setNote(roleModel.getNote());
            role.setIsSystem(roleModel.getIsSystem());
        }
        return role;
    }

}

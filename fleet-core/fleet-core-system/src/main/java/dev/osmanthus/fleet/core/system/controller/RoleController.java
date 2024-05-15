package dev.osmanthus.fleet.core.system.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.core.system.entity.Role;
import dev.osmanthus.fleet.core.system.model.RoleModel;
import dev.osmanthus.fleet.core.system.repository.RoleRepository;
import dev.osmanthus.fleet.core.system.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/system/role")
@RestController("dev.osmanthus.fleet.core.system.controller.RoleController")
public class RoleController extends AbstractController<Role, RoleModel, RoleRepository, RoleService> {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        super(roleService);
        this.roleService = roleService;
    }
}

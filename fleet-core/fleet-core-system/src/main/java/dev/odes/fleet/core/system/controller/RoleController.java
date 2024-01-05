package dev.odes.fleet.core.system.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.core.system.entity.Role;
import dev.odes.fleet.core.system.model.RoleModel;
import dev.odes.fleet.core.system.repository.RoleRepository;
import dev.odes.fleet.core.system.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/system/role")
@RestController("dev.odes.fleet.core.system.controller.RoleController")
public class RoleController extends AbstractController<Role, RoleModel, RoleRepository, RoleService> {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        super(roleService);
        this.roleService = roleService;
    }
}

package dev.odes.fleet.core.system.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.core.system.entity.User;
import dev.odes.fleet.core.system.model.UserModel;
import dev.odes.fleet.core.system.repository.UserRepository;
import dev.odes.fleet.core.system.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/system/user")
@RestController("dev.odes.fleet.core.system.controller.UserController")
public class UserController extends AbstractController<User, UserModel, UserRepository, UserService> {
    private final UserService userService;

    public UserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }
}

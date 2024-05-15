package dev.osmanthus.fleet.core.system.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.core.system.entity.User;
import dev.osmanthus.fleet.core.system.model.UserModel;
import dev.osmanthus.fleet.core.system.repository.UserRepository;
import dev.osmanthus.fleet.core.system.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/system/user")
@RestController("dev.osmanthus.fleet.core.system.controller.UserController")
public class UserController extends AbstractController<User, UserModel, UserRepository, UserService> {
    private final UserService userService;

    public UserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }
}

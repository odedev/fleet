package dev.odes.fleet.core.uc.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.core.uc.entity.User;
import dev.odes.fleet.core.uc.model.UserModel;
import dev.odes.fleet.core.uc.repository.UserRepository;
import dev.odes.fleet.core.uc.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/uc/user")
public class UserController extends AbstractController<User, UserModel, UserRepository, UserService> {
    private final UserService userService;

    public UserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }
}

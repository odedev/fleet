package dev.osmanthus.fleet.core.system.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.core.system.entity.Menu;
import dev.osmanthus.fleet.core.system.model.MenuModel;
import dev.osmanthus.fleet.core.system.repository.MenuRepository;
import dev.osmanthus.fleet.core.system.service.MenuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/system/menu")
@RestController("dev.osmanthus.fleet.core.system.controller.MenuController")
public class MenuController extends AbstractController<Menu, MenuModel, MenuRepository, MenuService> {
    private MenuService menuService;

    public MenuController(MenuService menuService) {
        super(menuService);
        this.menuService = menuService;
    }
}

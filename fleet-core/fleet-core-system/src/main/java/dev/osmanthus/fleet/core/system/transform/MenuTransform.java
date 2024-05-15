package dev.osmanthus.fleet.core.system.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.core.system.entity.Menu;
import dev.osmanthus.fleet.core.system.model.MenuModel;
import dev.osmanthus.fleet.core.system.repository.MenuRepository;
import org.springframework.stereotype.Component;

@Component("dev.osmanthus.fleet.core.system.transform.MenuTransform")
public class MenuTransform implements Transform<Menu, MenuModel> {
    private final MenuRepository menuRepository;

    public MenuTransform(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    private MenuModel fromEntity(Menu menu) {
        if (menu == null) {
            return null;
        }
        MenuModel menuModel = new MenuModel();
        menuModel.setId(menu.getId());
        menuModel.setCode(menu.getCode());
        menuModel.setName(menu.getName());
        menuModel.setPath(menu.getPath());
        menuModel.setIcon(menu.getIcon());
        menuModel.setSequence(menu.getSequence());
        menuModel.setNote(menu.getNote());
        menuModel.setIsSystem(menu.getIsSystem());
        menuModel.setParent(null);
        return menuModel;
    }

    private Menu fromModel(MenuModel menuModel) {
        if (menuModel == null) {
            return null;
        }
        Menu menu = new Menu();
        menu.setId(menuModel.getId());
        menu.setCode(menuModel.getCode());
        menu.setName(menuModel.getName());
        menu.setPath(menuModel.getPath());
        menu.setIcon(menuModel.getIcon());
        menu.setSequence(menuModel.getSequence());
        menu.setNote(menuModel.getNote());
        menu.setIsSystem(menuModel.getIsSystem());

        MenuModel parent = menuModel.getParent();
        if (parent != null) {
            menu.setParent(parent.getId());
        }
        return menu;
    }

    @Override
    public MenuModel toModel(Menu menu) {
        MenuModel menuModel = this.fromEntity(menu);
        if (menu != null) {
            Menu parent = this.menuRepository.findOneById(menu.getParent());
            menuModel.setParent(this.fromEntity(parent));
        }
        return menuModel;
    }

    @Override
    public Menu toEntity(MenuModel menuModel) {
        return this.fromModel(menuModel);
    }

}

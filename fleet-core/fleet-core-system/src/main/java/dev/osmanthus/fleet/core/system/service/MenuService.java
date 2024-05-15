package dev.osmanthus.fleet.core.system.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.core.system.entity.Menu;
import dev.osmanthus.fleet.core.system.model.MenuModel;
import dev.osmanthus.fleet.core.system.repository.MenuRepository;
import dev.osmanthus.fleet.core.system.transform.MenuTransform;
import org.springframework.stereotype.Service;

@Service("dev.osmanthus.fleet.core.system.service.MenuService")
public class MenuService extends AbstractService<Menu, MenuModel, MenuRepository> {
    private final MenuTransform menuTransform;
    private final MenuRepository menuRepository;

    public MenuService(MenuTransform menuTransform, MenuRepository menuRepository) {
        super(menuRepository);
        this.menuTransform = menuTransform;
        this.menuRepository = menuRepository;
    }

    @Override
    public MenuModel transform(Menu menu) {
        return this.menuTransform.toModel(menu);
    }

    @Override
    public Menu transform(MenuModel menuModel) {
        return this.menuTransform.toEntity(menuModel);
    }

    @Override
    public void setDefaultValue(MenuModel menuModel) {
    }

    @Override
    public void validate(MenuModel menuModel) {
    }

    @Override
    public void beforeInsert(MenuModel menuModel) {
    }

    @Override
    public void beforeUpdate(MenuModel menuModel) {
    }

    @Override
    public void beforeDelete(MenuModel menuModel) {
    }

    @Override
    public void inserted(MenuModel menuModel) {
    }

    @Override
    public void updated(MenuModel menuModel) {
    }

    @Override
    public void deleted(MenuModel menuModel) {
    }
}

package dev.odes.fleet.core.system.repository;

import dev.odes.fleet.component.mysql.MysqlRepository;
import dev.odes.fleet.core.system.entity.Menu;
import dev.odes.fleet.core.system.mapper.MenuMapper;
import org.springframework.stereotype.Repository;

@Repository("dev.odes.fleet.core.system.repository.MenuRepository")
public class MenuRepository extends MysqlRepository<Menu, MenuMapper> {
    private final MenuMapper menuMapper;

    public MenuRepository(MenuMapper menuMapper) {
        super(menuMapper);
        this.menuMapper = menuMapper;
    }
}

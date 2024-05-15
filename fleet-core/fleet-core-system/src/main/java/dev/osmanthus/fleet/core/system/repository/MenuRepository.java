package dev.osmanthus.fleet.core.system.repository;

import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import dev.osmanthus.fleet.core.system.entity.Menu;
import dev.osmanthus.fleet.core.system.mapper.MenuMapper;
import org.springframework.stereotype.Repository;

@Repository("dev.osmanthus.fleet.core.system.repository.MenuRepository")
public class MenuRepository extends MysqlRepository<Menu, MenuMapper> {
    private final MenuMapper menuMapper;

    public MenuRepository(MenuMapper menuMapper) {
        super(menuMapper);
        this.menuMapper = menuMapper;
    }
}

package dev.odes.fleet.core.system.mapper;

import dev.odes.fleet.core.system.entity.Menu;
import dev.odes.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("dev.odes.fleet.core.system.mapper.MenuMapper")
public interface MenuMapper extends GenericMapper<Menu> {
}

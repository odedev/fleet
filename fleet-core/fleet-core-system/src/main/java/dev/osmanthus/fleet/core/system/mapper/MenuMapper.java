package dev.osmanthus.fleet.core.system.mapper;

import dev.osmanthus.fleet.core.system.entity.Menu;
import dev.osmanthus.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("dev.osmanthus.fleet.core.system.mapper.MenuMapper")
public interface MenuMapper extends GenericMapper<Menu> {
}

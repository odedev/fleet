package dev.odes.fleet.tool.develop.mapper;

import dev.odes.fleet.tool.develop.entity.View;
import dev.odes.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ViewMapper extends GenericMapper<View> {
}

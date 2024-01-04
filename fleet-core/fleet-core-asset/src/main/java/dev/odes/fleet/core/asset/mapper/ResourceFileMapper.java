package dev.odes.fleet.core.asset.mapper;

import dev.odes.fleet.core.asset.entity.ResourceFile;
import dev.odes.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("dev.odes.fleet.core.asset.mapper.ResourceFileMapper")
public interface ResourceFileMapper extends GenericMapper<ResourceFile> {
}

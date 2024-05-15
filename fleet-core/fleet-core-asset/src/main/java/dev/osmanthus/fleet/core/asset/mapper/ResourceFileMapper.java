package dev.osmanthus.fleet.core.asset.mapper;

import dev.osmanthus.fleet.core.asset.entity.ResourceFile;
import dev.osmanthus.fleet.component.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("dev.osmanthus.fleet.core.asset.mapper.ResourceFileMapper")
public interface ResourceFileMapper extends GenericMapper<ResourceFile> {
}

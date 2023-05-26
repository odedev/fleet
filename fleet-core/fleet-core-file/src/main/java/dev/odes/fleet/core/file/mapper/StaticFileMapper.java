package dev.odes.fleet.core.file.mapper;

import dev.odes.fleet.core.file.entity.StaticFile;
import dev.odes.fleet.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaticFileMapper extends GenericMapper<StaticFile> {
}

package dev.osmanthus.fleet.tool.develop.repository;

import dev.osmanthus.fleet.tool.develop.entity.Module;
import dev.osmanthus.fleet.tool.develop.mapper.ModuleMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ModuleRepository extends MysqlRepository<Module, ModuleMapper> {
    private final ModuleMapper moduleMapper;
    public ModuleRepository(ModuleMapper moduleMapper) {
        super(moduleMapper);
        this.moduleMapper = moduleMapper;
    }
}

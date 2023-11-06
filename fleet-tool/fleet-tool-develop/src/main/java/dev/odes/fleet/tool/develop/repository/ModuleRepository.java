package dev.odes.fleet.tool.develop.repository;

import dev.odes.fleet.tool.develop.entity.Module;
import dev.odes.fleet.tool.develop.mapper.ModuleMapper;
import dev.odes.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ModuleRepository extends MysqlRepository<Module, ModuleMapper> {
    private final ModuleMapper moduleMapper;
    public ModuleRepository(ModuleMapper moduleMapper) {
        super(moduleMapper);
        this.moduleMapper = moduleMapper;
    }
}

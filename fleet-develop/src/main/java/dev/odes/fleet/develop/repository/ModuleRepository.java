package dev.odes.fleet.develop.repository;

import dev.odes.fleet.develop.entity.Module;
import dev.odes.fleet.develop.mapper.ModuleMapper;
import dev.odes.fleet.database.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ModuleRepository extends MysqlRepository<Module, ModuleMapper> {
    private final ModuleMapper moduleMapper;
    public ModuleRepository(ModuleMapper moduleMapper) {
        super(moduleMapper);
        this.moduleMapper = moduleMapper;
    }
}

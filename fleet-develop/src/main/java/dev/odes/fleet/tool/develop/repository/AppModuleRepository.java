package dev.odes.fleet.tool.develop.repository;

import dev.odes.fleet.tool.develop.entity.AppModule;
import dev.odes.fleet.tool.develop.mapper.AppModuleMapper;
import dev.odes.fleet.database.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AppModuleRepository extends MysqlRepository<AppModule, AppModuleMapper> {
    private final AppModuleMapper appModuleMapper;
    public AppModuleRepository(AppModuleMapper mapper) {
        super(mapper);
        this.appModuleMapper = mapper;
    }
}

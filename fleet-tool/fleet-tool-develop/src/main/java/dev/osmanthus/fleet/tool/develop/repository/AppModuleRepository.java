package dev.osmanthus.fleet.tool.develop.repository;

import dev.osmanthus.fleet.tool.develop.entity.AppModule;
import dev.osmanthus.fleet.tool.develop.mapper.AppModuleMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AppModuleRepository extends MysqlRepository<AppModule, AppModuleMapper> {
    private final AppModuleMapper appModuleMapper;
    public AppModuleRepository(AppModuleMapper mapper) {
        super(mapper);
        this.appModuleMapper = mapper;
    }
}

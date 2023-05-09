package dev.odes.fleet.develop.repository;

import dev.odes.fleet.develop.entity.AppModule;
import dev.odes.fleet.develop.mapper.AppModuleMapper;
import dev.odes.fleet.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AppModuleRepository extends MysqlRepository<AppModule, AppModuleMapper> {
    private final AppModuleMapper appModuleMapper;
    public AppModuleRepository(AppModuleMapper mapper) {
        super(mapper);
        this.appModuleMapper = mapper;
    }
}

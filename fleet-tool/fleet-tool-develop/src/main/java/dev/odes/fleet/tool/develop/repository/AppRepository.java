package dev.odes.fleet.tool.develop.repository;

import dev.odes.fleet.tool.develop.entity.App;
import dev.odes.fleet.tool.develop.mapper.AppMapper;
import dev.odes.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AppRepository extends MysqlRepository<App, AppMapper> {

    public AppRepository(AppMapper appMapper) {
        super(appMapper);
    }

}

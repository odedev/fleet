package dev.osmanthus.fleet.tool.develop.repository;

import dev.osmanthus.fleet.tool.develop.entity.App;
import dev.osmanthus.fleet.tool.develop.mapper.AppMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AppRepository extends MysqlRepository<App, AppMapper> {

    public AppRepository(AppMapper appMapper) {
        super(appMapper);
    }

}

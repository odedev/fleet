package dev.odes.fleet.develop.repository;

import dev.odes.fleet.develop.entity.App;
import dev.odes.fleet.develop.mapper.AppMapper;
import dev.odes.fleet.database.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AppRepository extends MysqlRepository<App, AppMapper> {

    public AppRepository(AppMapper appMapper) {
        super(appMapper);
    }

}

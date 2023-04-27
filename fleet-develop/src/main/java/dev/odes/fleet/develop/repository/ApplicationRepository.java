package dev.odes.fleet.develop.repository;

import dev.odes.fleet.develop.entity.Application;
import dev.odes.fleet.develop.mapper.ApplicationMapper;
import dev.odes.fleet.mysql.MysqlRepository;

public class ApplicationRepository extends MysqlRepository<Application, ApplicationMapper> {

    public ApplicationRepository(ApplicationMapper applicationMapper) {
        super(applicationMapper);
    }

    public Application findOne() {
        return null;
    }
}

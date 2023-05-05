package dev.odes.fleet.develop.repository;

import dev.odes.fleet.develop.entity.View;
import dev.odes.fleet.develop.mapper.ViewMapper;
import dev.odes.fleet.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ViewRepository extends MysqlRepository<View, ViewMapper> {
    private final ViewMapper viewMapper;

    public ViewRepository(ViewMapper viewMapper) {
        super(viewMapper);
        this.viewMapper = viewMapper;
    }
}

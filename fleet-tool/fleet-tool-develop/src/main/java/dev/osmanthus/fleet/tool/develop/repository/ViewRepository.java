package dev.osmanthus.fleet.tool.develop.repository;

import dev.osmanthus.fleet.tool.develop.entity.View;
import dev.osmanthus.fleet.tool.develop.mapper.ViewMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ViewRepository extends MysqlRepository<View, ViewMapper> {
    private final ViewMapper viewMapper;

    public ViewRepository(ViewMapper viewMapper) {
        super(viewMapper);
        this.viewMapper = viewMapper;
    }
}

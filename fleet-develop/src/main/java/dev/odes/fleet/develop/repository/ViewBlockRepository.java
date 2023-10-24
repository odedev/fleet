package dev.odes.fleet.develop.repository;

import dev.odes.fleet.develop.entity.ViewBlock;
import dev.odes.fleet.develop.mapper.ViewBlockMapper;
import dev.odes.fleet.database.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ViewBlockRepository extends MysqlRepository<ViewBlock, ViewBlockMapper> {
    private final ViewBlockMapper viewBlockMapper;
    public ViewBlockRepository(ViewBlockMapper viewBlockMapper) {
        super(viewBlockMapper);
        this.viewBlockMapper = viewBlockMapper;
    }
}

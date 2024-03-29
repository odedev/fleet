package dev.odes.fleet.tool.develop.repository;

import dev.odes.fleet.tool.develop.entity.ViewBlock;
import dev.odes.fleet.tool.develop.mapper.ViewBlockMapper;
import dev.odes.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ViewBlockRepository extends MysqlRepository<ViewBlock, ViewBlockMapper> {
    private final ViewBlockMapper viewBlockMapper;
    public ViewBlockRepository(ViewBlockMapper viewBlockMapper) {
        super(viewBlockMapper);
        this.viewBlockMapper = viewBlockMapper;
    }
}

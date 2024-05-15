package dev.osmanthus.fleet.tool.develop.repository;

import dev.osmanthus.fleet.tool.develop.entity.ViewBlock;
import dev.osmanthus.fleet.tool.develop.mapper.ViewBlockMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ViewBlockRepository extends MysqlRepository<ViewBlock, ViewBlockMapper> {
    private final ViewBlockMapper viewBlockMapper;
    public ViewBlockRepository(ViewBlockMapper viewBlockMapper) {
        super(viewBlockMapper);
        this.viewBlockMapper = viewBlockMapper;
    }
}

package dev.osmanthus.fleet.tool.develop.repository;

import dev.osmanthus.fleet.tool.develop.entity.Model;
import dev.osmanthus.fleet.tool.develop.mapper.ModelMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ModelRepository extends MysqlRepository<Model, ModelMapper> {
    private final ModelMapper mapper;
    public ModelRepository(ModelMapper mapper) {
        super(mapper);
        this.mapper = mapper;
    }
}

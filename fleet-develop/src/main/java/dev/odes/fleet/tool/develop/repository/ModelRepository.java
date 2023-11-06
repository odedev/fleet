package dev.odes.fleet.tool.develop.repository;

import dev.odes.fleet.tool.develop.entity.Model;
import dev.odes.fleet.tool.develop.mapper.ModelMapper;
import dev.odes.fleet.database.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ModelRepository extends MysqlRepository<Model, ModelMapper> {
    private final ModelMapper mapper;
    public ModelRepository(ModelMapper mapper) {
        super(mapper);
        this.mapper = mapper;
    }
}

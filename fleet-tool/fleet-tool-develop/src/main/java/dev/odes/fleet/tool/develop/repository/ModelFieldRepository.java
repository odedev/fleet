package dev.odes.fleet.tool.develop.repository;

import dev.odes.fleet.tool.develop.entity.ModelField;
import dev.odes.fleet.tool.develop.mapper.ModelFieldMapper;
import dev.odes.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ModelFieldRepository extends MysqlRepository<ModelField, ModelFieldMapper> {
    private final ModelFieldMapper mapper;
    public ModelFieldRepository(ModelFieldMapper mapper) {
        super(mapper);
        this.mapper = mapper;
    }
}

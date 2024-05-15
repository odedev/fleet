package dev.osmanthus.fleet.tool.develop.repository;

import dev.osmanthus.fleet.tool.develop.entity.ModelField;
import dev.osmanthus.fleet.tool.develop.mapper.ModelFieldMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ModelFieldRepository extends MysqlRepository<ModelField, ModelFieldMapper> {
    private final ModelFieldMapper mapper;
    public ModelFieldRepository(ModelFieldMapper mapper) {
        super(mapper);
        this.mapper = mapper;
    }
}

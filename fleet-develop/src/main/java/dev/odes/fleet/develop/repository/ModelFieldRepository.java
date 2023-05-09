package dev.odes.fleet.develop.repository;

import dev.odes.fleet.develop.entity.ModelField;
import dev.odes.fleet.develop.mapper.ModelFieldMapper;
import dev.odes.fleet.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ModelFieldRepository extends MysqlRepository<ModelField, ModelFieldMapper> {
    private final ModelFieldMapper mapper;
    public ModelFieldRepository(ModelFieldMapper mapper) {
        super(mapper);
        this.mapper = mapper;
    }
}

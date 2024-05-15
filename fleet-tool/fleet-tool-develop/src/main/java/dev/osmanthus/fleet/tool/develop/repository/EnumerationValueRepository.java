package dev.osmanthus.fleet.tool.develop.repository;

import dev.osmanthus.fleet.tool.develop.entity.EnumerationValue;
import dev.osmanthus.fleet.tool.develop.mapper.EnumerationValueMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EnumerationValueRepository extends MysqlRepository<EnumerationValue, EnumerationValueMapper> {
    private final EnumerationValueMapper enumerationValueMapper;
    public EnumerationValueRepository(EnumerationValueMapper enumerationValueMapper) {
        super(enumerationValueMapper);
        this.enumerationValueMapper = enumerationValueMapper;
    }
}

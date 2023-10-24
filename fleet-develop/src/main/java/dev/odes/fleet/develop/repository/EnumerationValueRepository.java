package dev.odes.fleet.develop.repository;

import dev.odes.fleet.develop.entity.EnumerationValue;
import dev.odes.fleet.develop.mapper.EnumerationValueMapper;
import dev.odes.fleet.database.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EnumerationValueRepository extends MysqlRepository<EnumerationValue, EnumerationValueMapper> {
    private final EnumerationValueMapper enumerationValueMapper;
    public EnumerationValueRepository(EnumerationValueMapper enumerationValueMapper) {
        super(enumerationValueMapper);
        this.enumerationValueMapper = enumerationValueMapper;
    }
}

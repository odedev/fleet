package dev.odes.fleet.develop.repository;

import dev.odes.fleet.develop.entity.Enumeration;
import dev.odes.fleet.develop.mapper.EnumerationMapper;
import dev.odes.fleet.database.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EnumerationRepository extends MysqlRepository<Enumeration, EnumerationMapper> {
    private final EnumerationMapper enumerationMapper;
    public EnumerationRepository(EnumerationMapper enumerationMapper) {
        super(enumerationMapper);
        this.enumerationMapper = enumerationMapper;
    }
}

package dev.odes.fleet.tool.develop.repository;

import dev.odes.fleet.tool.develop.entity.Enumeration;
import dev.odes.fleet.tool.develop.mapper.EnumerationMapper;
import dev.odes.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EnumerationRepository extends MysqlRepository<Enumeration, EnumerationMapper> {
    private final EnumerationMapper enumerationMapper;
    public EnumerationRepository(EnumerationMapper enumerationMapper) {
        super(enumerationMapper);
        this.enumerationMapper = enumerationMapper;
    }
}

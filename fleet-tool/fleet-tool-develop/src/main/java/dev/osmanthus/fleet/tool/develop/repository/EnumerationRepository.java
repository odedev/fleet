package dev.osmanthus.fleet.tool.develop.repository;

import dev.osmanthus.fleet.tool.develop.entity.Enumeration;
import dev.osmanthus.fleet.tool.develop.mapper.EnumerationMapper;
import dev.osmanthus.fleet.component.mysql.MysqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EnumerationRepository extends MysqlRepository<Enumeration, EnumerationMapper> {
    private final EnumerationMapper enumerationMapper;
    public EnumerationRepository(EnumerationMapper enumerationMapper) {
        super(enumerationMapper);
        this.enumerationMapper = enumerationMapper;
    }
}

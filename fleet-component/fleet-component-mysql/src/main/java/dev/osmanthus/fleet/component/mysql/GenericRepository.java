package dev.osmanthus.fleet.component.mysql;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenericRepository {
    private final JdbcTemplate jdbcTemplate;

    public GenericRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void execute(String sql) {
        this.jdbcTemplate.execute(sql);
    }

    public <T> List<T> query(String sql, Class<T> clazz) {
        List<T> list = this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(clazz));
        return list;
    }
}

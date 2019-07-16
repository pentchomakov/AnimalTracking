package com.pentchomakov.wildanimaltracking;

import com.pentchomakov.wildanimaltracking.dao.AnimalDAO;
import com.pentchomakov.wildanimaltracking.dao.AnimalDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringJDBCConfiguration {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/animals_db");
        dataSource.setUsername("root");
        dataSource.setPassword("123abc");

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public AnimalDAO animalDAO() {
        AnimalDAOImpl animalDAO = new AnimalDAOImpl();
        animalDAO.setJdbcTemplate(jdbcTemplate());
        return animalDAO;
    }
}

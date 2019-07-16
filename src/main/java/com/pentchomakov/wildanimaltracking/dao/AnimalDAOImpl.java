package com.pentchomakov.wildanimaltracking.dao;

import com.pentchomakov.wildanimaltracking.model.Animal;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimalDAOImpl implements AnimalDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public String findAnimalById (int animalId) {

        String sql = "select animal_name from animal where animal_id = ?";
        String name = jdbcTemplate.queryForObject(sql, new Object[]{animalId}, String.class);
        /*
        animal = new Animal(
                resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3)
        );

        */
        return name;
    }
}

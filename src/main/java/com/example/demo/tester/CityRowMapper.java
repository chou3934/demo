package com.example.demo.tester;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Callable;

public class CityRowMapper implements RowMapper<City> {

    @Override
    public City mapRow(ResultSet rs, int rowNum) throws SQLException {
        City city=new City();
        city.setCityId(rs.getInt("cityId"));
        city.setCityName(rs.getString("cityName"));
        city.setCode(rs.getString("code"));

        return city;
    }
}

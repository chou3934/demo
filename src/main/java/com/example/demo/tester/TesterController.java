package com.example.demo.tester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TesterController {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @GetMapping("/users/{userId}")
    public User search(@PathVariable Integer userId){



        String sql= "SELECT id,name,cityName,code FROM mixed WHERE id= :userId";

        Map<String,Object> map=new HashMap<>();
        map.put("userId",userId);

        List<User> list = namedParameterJdbcTemplate.query(sql,map,new UserRowMapper());

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }

    }
}

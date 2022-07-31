package com.example.demo.tester;

import com.example.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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



    @GetMapping("/users/{id}")
    public ResponseEntity<?> search(@PathVariable Integer id) {

        //city資訊
        String sql2 = "SELECT c.cityId, c.cityName, c.code " +
                "FROM student as s " +
                "LEFT JOIN city as c ON s.city=c.cityId " +
                "WHERE s.id= :id";

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", id);

        List<City> cityList = namedParameterJdbcTemplate.query(sql2, map2, new CityRowMapper());


        //user
        String sql="SELECT id, name FROM student WHERE id= :id";

        Map<String ,Object> map =new HashMap<>();
        map.put("id",id);

        List<User> userList=namedParameterJdbcTemplate.query(sql,map,new UserRowMapper());

        //user+city資訊
        User user=userList.get(0);
        user.setCityList(cityList);

        if(userList.size()>0){
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }else {
            return null;
        }

    }





    /*@Autowired
    private UserRepository userRepository;


    @GetMapping("/users/{userId}")
    public User read(@PathVariable Integer userId){

        User user =userRepository.findById(userId).orElse(null);

        return user;
    }*/









}

package com.example.demo.tester;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.xml.bind.v2.TODO;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cityId")
    Integer cityId;

    @Column(name = "cityName")
    String cityName;

    @Column(name="code")
    String code;


    @OneToOne(mappedBy = "city")
    private User user;

    public City(){

    }

    public City(Integer cityId){
        this.cityId=cityId;
    }


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

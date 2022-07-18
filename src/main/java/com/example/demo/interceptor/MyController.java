package com.example.demo.interceptor;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/test1")
    public String test1(){
        System.out.println("執行test1方法");
        return "Hello test1";
    }

    @RequestMapping("/test2")
    public String test2(){
        System.out.println("執行test2方法");
        return "Hello test2";
    }

    /*@RequestMapping("/test1")
    public String test1(@RequestParam Integer id, @RequestParam(defaultValue = "Any") String name){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        return "Hello test1";
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody Student student){
        System.out.println("student id:"+student.getId());
        System.out.println("student name:"+student.getName());
        return "Hello test2";
    }

    @RequestMapping("/test3")
    public String test3(@RequestHeader String info){
        System.out.println("head info:"+info);
        return "Hello test3";
    }

    @RequestMapping("/test4/{id}/{name}")
    public String test4(@PathVariable Integer id,@PathVariable String name){
        System.out.println("path id:"+id);
        System.out.println("path name:"+name);
        return "Hello test4";
    }*/

    /*@RequestMapping("/product")
    public Store product(){
        Store store=new Store();
        List<String> list=new ArrayList<>();
        list.add("蘋果");
        list.add("橘子");
        store.setProductList(list);
        return store;
    }

    @RequestMapping("/user")
    public Student user(){
        Student student=new Student();
        student.setName("Judy");
        return student;
    }*/

    /*@Autowired
    @Qualifier("hpPrinter")
    private Printer printer;

    @RequestMapping("/test")
    public String test(){
        System.out.println("Hi!");
        printer.print("Hello World");
        return "Hello World";
    }*/
}

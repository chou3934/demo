package com.example.demo.basic;

import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer {

    /*@Value("${printer.name}")
    private String name;

    @Value("${printer.count}")
    private int count;*/

    /*@PostConstruct
    public void initialize(){
        count=5;
    }*/

    @Override
    public void print(String message) {
        System.out.println("HP印表機："+message);


        /*count--;
        System.out.println(name+":"+message);
        System.out.println("count:"+count);*/
    }
}

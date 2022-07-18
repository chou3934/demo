package com.example.demo.basic;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class MyAspect {

    /*@Around("execution(* com.example.demo.basic.HpPrinter.*(..))")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        Date start=new Date();
        Object obj=pjp.proceed();
        Date end=new Date();
        long time=end.getTime()-start.getTime();
        System.out.println(time);
        return obj;
    }*/

    public static class Store {
        List<String> productList;

        public List<String> getProductList() {
            return productList;
        }

        public void setProductList(List<String> productList) {
            this.productList = productList;
        }
    }
}

package com.example.demo2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Configuration
public class MyAspect {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Before(value = "execution(public String com.example.demo2.shapes.Circle.getName())")
    public void print(JoinPoint joinPoint) {
//        System.out.println("HELLO FROM THE ASPECTJ ");
//        System.out.println(joinPoint);
        logger.log(Level.SEVERE, "This is a Before Aspect ");
    }

    @After(value = "execution(public * com.example.demo2.shapes.Circle.getName())")
    public void printAfter() {
        logger.log(Level.SEVERE, "This is a After Aspect ");
    }

    @Pointcut(value = "within(com.example.demo2.shapes.Circle.*)")
    public void P1() {
    }
}

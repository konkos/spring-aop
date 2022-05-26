package com.example.demo2;

import com.example.demo2.shapes.Circle;
import com.example.demo2.shapes.Square;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Demo2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Demo2Application.class, args);

        Circle circle = configurableApplicationContext.getBean("circle1", Circle.class);
        System.out.println(circle);

        Circle circle2 = configurableApplicationContext.getBean("circle2", Circle.class);
        System.out.println("GET NAME " + circle2.getName());

        Square square = configurableApplicationContext.getBean("square1", Square.class);
        System.out.println(square);
    }


}

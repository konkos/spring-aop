package com.example.demo2.shapes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapesBeansConfig {

    @Bean("circle1")
    public Circle circle1() {
        Circle circle = new Circle();
        circle.setName("circle1 Bean");
        return circle;
    }

    @Bean("circle2")
    public Circle circle2() {
        Circle circle = new Circle();
        circle.setName("circle2 Bean");
        return circle;
    }

    @Bean("square1")
    public Square square1() {
        Square square = new Square();
        square.setName("square Bean");
        return square;
    }
}

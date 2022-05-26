package com.example.demo2.shapes;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
    private String name;

    public Circle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                '}';
    }
}

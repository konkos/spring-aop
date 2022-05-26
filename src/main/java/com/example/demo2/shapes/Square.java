package com.example.demo2.shapes;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {
    private String name;

    public Square() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                '}';
    }
}

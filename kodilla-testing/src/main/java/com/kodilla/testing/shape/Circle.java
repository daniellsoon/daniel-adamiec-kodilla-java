package com.kodilla.testing.shape;

public class Circle implements Shape {

    private Double a;

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return 3.14 * 5 * 5;
    }
}

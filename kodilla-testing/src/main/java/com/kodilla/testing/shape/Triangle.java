package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private Double a;

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 0.5 * 5 * 5;
    }
}

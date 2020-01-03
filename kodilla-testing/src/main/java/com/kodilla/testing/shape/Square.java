package com.kodilla.testing.shape;

public class Square implements Shape {

    private Double a;

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return 5 * 5;
    }
}

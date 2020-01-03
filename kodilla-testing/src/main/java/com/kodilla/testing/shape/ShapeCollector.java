package com.kodilla.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {

    private ArrayList<Shape> allFigures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        allFigures.add(shape);
    }

    public void removeFigure(Shape shape) {
        allFigures.remove(shape);
    }

    public Shape getFigure(int n) {
        return allFigures.get(n);
    }

    public void showFigures() {
        for (Shape figure : allFigures) {
            System.out.println("This Figure: " + figure.getShapeName() + " Field is: " + figure.getField());
        }
    }

    public int getListSize () {
        return allFigures.size();
    }

    }
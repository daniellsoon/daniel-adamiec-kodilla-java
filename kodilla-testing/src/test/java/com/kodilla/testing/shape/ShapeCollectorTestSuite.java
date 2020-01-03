package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

    }

    @Test
    public void testShapeAdd() {
        //Given
        ShapeCollector allShapes = new ShapeCollector();
        Shape addedShape = new Circle();


        //When
        allShapes.addFigure(addedShape);
        int listSize = allShapes.getListSize();

        //Then
        Assert.assertEquals(1, listSize);

    }

    @Test
    public void testShapeRemove() {
        //Given
        ShapeCollector allShapes = new ShapeCollector();
        Shape addedShape = new Circle();


        //When
        allShapes.addFigure(addedShape);
        allShapes.removeFigure(addedShape);
        int listSize = allShapes.getListSize();

        //Then
        Assert.assertEquals(0, listSize);

    }

    @Test
    public void testShapeGet() {
        //Given
        ShapeCollector allShapes = new ShapeCollector();
        Shape addedShape = new Circle();

        //When
        allShapes.addFigure(addedShape);
        Shape recivedShape = allShapes.getFigure(0);

        //Then
        Assert.assertEquals(addedShape, recivedShape);
    }

    @Test
    public void testShapeShow() {
        //Given
        ShapeCollector allShapes = new ShapeCollector();
        Shape addedShape = new Circle();

        //When
        allShapes.addFigure(addedShape);
        allShapes.showFigures();

    }

}

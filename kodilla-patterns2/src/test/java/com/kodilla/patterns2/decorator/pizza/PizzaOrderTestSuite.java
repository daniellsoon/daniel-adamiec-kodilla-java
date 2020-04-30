package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        System.out.println("Price of pizza is: " + pizzaOrder.getCost());
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(19), cost);
    }

    @Test
    public void testPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza: tomato sauce, cheese, bacon, onion", description);
    }
}

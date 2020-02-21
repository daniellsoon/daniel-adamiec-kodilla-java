package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(2.5, 2.5);
        double subResult = calculator.sub(5, 2.3);
        double mulResult = calculator.mul(2,2);
        double divResult = calculator.div(10, 2);
        //Then
        Assert.assertEquals(5.0, addResult, 0);
        Assert.assertEquals(2.7, subResult,0);
        Assert.assertEquals(4, mulResult,0);
        Assert.assertEquals(5, divResult, 0);
    }
}
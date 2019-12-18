package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator selcted = new OddNumbersExterminator();
        ArrayList<Integer> numCollection1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

        //When
        selcted.exterminate(numCollection1);

        //Then
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(selcted.getNumber(i), result.get(i));
        }
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator selcted = new OddNumbersExterminator();
        ArrayList<Integer> numCollection = new ArrayList<>();

        //When
        selcted.exterminate(numCollection);

    }
}

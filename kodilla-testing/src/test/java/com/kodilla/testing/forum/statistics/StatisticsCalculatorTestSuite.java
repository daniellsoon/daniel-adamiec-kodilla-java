package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testCalculateAdvStatisticsV1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listOfUsers = new ArrayList<String>();
        List<String> emptyListOfUsers = new ArrayList<String>();
        for (int i=0; i < 100; i++) {
            listOfUsers.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(emptyListOfUsers).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(0).thenReturn(1000).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0).thenReturn(500).thenReturn(1500);

        StatisticsCalculator stats = new StatisticsCalculator();

        //When
        System.out.println("Test #1");
        stats.calculateAdvStatistics(statisticsMock);
        stats.showStatistics();
        System.out.println("");

        System.out.println("Test #2");
        stats.calculateAdvStatistics(statisticsMock);
        stats.showStatistics();
        System.out.println("");

        System.out.println("Test #1");
        stats.calculateAdvStatistics(statisticsMock);
        stats.showStatistics();
        System.out.println("");

    }

}

package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    private static int testCounter = 0;

    @Before
    public void before() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void after() {
        System.out.println(" ");
    }

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listOfUsers = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            listOfUsers.add("User" + i);
        }

        //when
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(500);

        StatisticsCalculator stats = new StatisticsCalculator();
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0 , stats.getNumberOfPosts());
        Assert.assertEquals(0.0 , stats.getPostsPerUser(), 0.0);
        System.out.println("Check information about calculate problem with posts = 0:");
        stats.showStatistics();
    }

    @Test
    public void testPosts1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listOfUsers = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            listOfUsers.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        StatisticsCalculator stats = new StatisticsCalculator();
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000 , stats.getNumberOfPosts());
        Assert.assertEquals(0.5 , stats.getCommentsPerPost(), 0.0);
        Assert.assertEquals(10.0 , stats.getPostsPerUser(), 0.0);
    }

    @Test
    public void testNoComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listOfUsers = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            listOfUsers.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator stats = new StatisticsCalculator();
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0 , stats.getNumberOfComments());
        Assert.assertEquals(0.0 , stats.getCommentsPerPost(), 0.0);
        Assert.assertEquals(0.0 , stats.getCommentsPerUser(), 0.0);
    }

    @Test
    public void testLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listOfUsers = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            listOfUsers.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        StatisticsCalculator stats = new StatisticsCalculator();
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(500 , stats.getNumberOfComments());
        Assert.assertEquals(1000 , stats.getNumberOfPosts());
        Assert.assertEquals(0.5 , stats.getCommentsPerPost(), 0.0);
    }

    @Test
    public void testMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listOfUsers = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            listOfUsers.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1500);

        StatisticsCalculator stats = new StatisticsCalculator();
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1500 , stats.getNumberOfComments());
        Assert.assertEquals(1000 , stats.getNumberOfPosts());
        Assert.assertEquals(1.5 , stats.getCommentsPerPost(), 0.0);
    }

    @Test
    public void testNoUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listOfUsers = new ArrayList<>();

        //When
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1500);

        StatisticsCalculator stats = new StatisticsCalculator();
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0 , stats.getNumberOfUsers());
        System.out.println("Check information about calculate problem with users = 0:");
        stats.showStatistics();

    }

    @Test
    public void testUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listOfUsers = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            listOfUsers.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        StatisticsCalculator stats = new StatisticsCalculator();
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100 , stats.getNumberOfUsers());
        Assert.assertEquals(5.0 , stats.getCommentsPerUser(), 0.0);
        Assert.assertEquals(10.0 , stats.getPostsPerUser(), 0.0);
    }

}

package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    public void getLastLog() {
        //Given
        logger = Logger.getInstance();
        //When
        logger.log("X1");
        String result = logger.getLastLog();
        //Then
        Assert.assertEquals("X1", result);
    }

    @Test
    public void getNewLastLog() {
        //Given
        logger = Logger.getInstance();
        //When
        logger.log("X2");
        String result = logger.getLastLog();
        //Then
        Assert.assertEquals("X2", result);
    }


}
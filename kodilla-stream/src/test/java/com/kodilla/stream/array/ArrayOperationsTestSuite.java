package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] values = new int[20];
        values[0] = 1;
        values[1] = 3;
        values[2] = 3;
        values[3] = 3;
        values[4] = 3;
        values[5] = 3;
        values[6] = 3;
        values[7] = 1;
        values[8] = 3;
        values[9] = 3;
        values[10] = 3;
        values[11] = 3;
        values[12] = 56;
        values[13] = 3;
        values[14] = 3;
        values[15] = 3;
        values[16] = 3;
        values[17] = 3;
        values[18] = 3;
        values[19] = 5;

        //When
        double result = ArrayOperations.getAverage(values);

        //Then
        Assert.assertEquals(5.55 , result , 0);

    }

}

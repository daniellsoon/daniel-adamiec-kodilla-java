package com.kodilla.stream.array;


import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        System.out.println("Int Array:");
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.print(numbers[n] + " "));
        System.out.println("");
        double average = Arrays.stream(numbers)
                .average()
                .getAsDouble();
        return average;






















    }
}


package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2 , 7.20));
        } catch (Exception e) {
            System.out.println("Problem with exception");
        }



    }

}

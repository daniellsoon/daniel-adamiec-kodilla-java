package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> oddOnly = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> numbers){
        if (numbers.isEmpty() != true) {
            for (int i = 1; i < numbers.size(); i++ ){
                if (numbers.get(i) % 2 == 0) {
                    oddOnly.add(numbers.get(i));
                }
            }
            System.out.println("Only odd numbers: " + oddOnly);
        } else {
            System.out.println("List is Empty");
        }
    }

    public Integer getNumber(int i) {
        return oddOnly.get(i);
    }


}

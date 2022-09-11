package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNr = new ArrayList<>();

        for (Integer elements : numbers) {
            if (elements % 2 == 0) {
                evenNr.add(elements);
            }
        }
        return evenNr;
    }
}
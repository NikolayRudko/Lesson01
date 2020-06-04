package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.validation.Validation;

public class MainEvenNumbers {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String[] arrayStrings = new String[]{"12", "11", "12", "9"};
        String countOfEvenNumbers = "2";

        if (validation.isInteger(arrayStrings) && validation.isInteger(countOfEvenNumbers)) {
            int[] arrayNumbers = new int[arrayStrings.length];
            for (int i = 0; i < arrayStrings.length; i++) {
                arrayNumbers[i] = Integer.parseInt(arrayStrings[i]);
            }
            PrintResult result = new PrintResult();
            result.printEvenNumbers(Integer.parseInt(countOfEvenNumbers), arrayNumbers);
        } else {
            System.out.println("Incorrect data");
        }
    }
}

package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.validation.Validation;

public class MainTableValue {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String valueA = "10";
        String valueB = "20";
        String step = "1";

        if (validation.isDouble(valueA) && validation.isDouble(valueB) && validation.isDouble(step)) {
            PrintResult result = new PrintResult();
            result.printTableValue(Double.parseDouble(valueA), Double.parseDouble(valueB), Double.parseDouble(step));
        } else {
            System.out.println("Incorrect data");
        }
    }
}

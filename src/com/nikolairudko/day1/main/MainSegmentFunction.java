package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.validation.Validation;

public class MainSegmentFunction {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String valueX = "6.9";

        if (validation.isDouble(valueX)) {
            PrintResult result = new PrintResult();
            result.printSegmentFunction(Double.parseDouble(valueX));
        } else {
            System.out.println("Incorrect data");
        }
    }
}

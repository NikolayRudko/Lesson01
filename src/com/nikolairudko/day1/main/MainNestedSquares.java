package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.validation.Validation;

public class MainNestedSquares {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String input = "128.9";

        if (validation.isPosDoubMoreZero(input)) {
            PrintResult result = new PrintResult();
            result.printParametersOfSquare(Double.parseDouble(input));
        } else {
            System.out.println("Incorrect data");
        }
    }
}

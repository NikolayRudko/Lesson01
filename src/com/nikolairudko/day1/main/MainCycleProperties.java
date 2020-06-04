package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.validation.Validation;

public class MainCycleProperties {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String radius = "43";

        if (validation.isPosDoubMoreZero(radius)) {
            PrintResult result = new PrintResult();
            result.printCycleProperties(Double.parseDouble(radius));
        } else {
            System.out.println("Incorrect data");
        }
    }
}

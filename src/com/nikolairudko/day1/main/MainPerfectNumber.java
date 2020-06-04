package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.validation.Validation;

public class MainPerfectNumber {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String perfectNumber = "6";

        if (validation.isPosIntMoreZero(perfectNumber)) {
            PrintResult result = new PrintResult();
            result.printIsPerfectNumber(Integer.parseInt(perfectNumber));
        } else {
            System.out.println("Incorrect data");
        }
    }
}

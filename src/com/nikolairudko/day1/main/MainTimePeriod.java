package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.validation.Validation;

public class MainTimePeriod {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String period = "14023";

        if (validation.isPosInt(period)) {
            PrintResult result = new PrintResult();
            result.printTimePeriod(Integer.parseInt(period));
        } else {
            System.out.println("Incorrect data");
        }
    }
}

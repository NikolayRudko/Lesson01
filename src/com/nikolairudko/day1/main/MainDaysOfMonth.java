package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.validation.Validation;

public class MainDaysOfMonth {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String year = "2000";
        String month = "2";

        if (validation.isYear(year) && validation.isMonth(month)) {
            PrintResult result = new PrintResult();
            result.printCountDay(Integer.parseInt(year), Integer.parseInt(month));
        } else {
            System.out.println("Incorrect data");
        }
    }
}

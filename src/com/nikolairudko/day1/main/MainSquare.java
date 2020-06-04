package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.validation.Validation;

public class MainSquare {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String input = "23";

        if (validation.isInteger(input)){
            PrintResult result = new PrintResult();
            result.printLastDigitOfSquare(Integer.parseInt(input));
        }else {
            System.out.println("Incorrect data");
        }
    }
}

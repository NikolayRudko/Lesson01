package com.nikolairudko.day1.service;

import java.util.ArrayList;

/*Статический импорт для Math*/
public class ArithmeticServices {

    public int lastDigitOfSquare(int number) {
        return (int) Math.pow(number % 10, 2) % 10;
    }

    public boolean isPerfectNumber(int number) {
        ArrayList<Integer> listOfDivider = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                listOfDivider.add(i);
            }
        }

        int sumOfDivider = 0;

        for (Integer divider : listOfDivider) {
            sumOfDivider += divider;
        }

        return number == sumOfDivider;
    }

    public boolean countOfEvenNumbers(int amount, int[] array) {
        int counter = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                counter++;
            }
        }

        return counter >= amount;
    }

    public double segmentFunction(double value) {
        if (value >= 3) {
            return -Math.pow(value, 2) + 3 * value + 9;
        }
        return Math.pow(Math.pow(value, 3) - 6, -1);
    }

    /*!!!!!!!!Проверить крайние значения*/
    public double[] tableSteps(double valueA, double valueB, double step) {
        double[] array = new double[Math.abs(Math.abs(valueA) - Math.abs(valueB)) > step ?
                (int) (Math.abs(valueA - valueB) / step) : 1];
        array[0] = valueA;
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + step;
            }
        }
        return array;
    }
}

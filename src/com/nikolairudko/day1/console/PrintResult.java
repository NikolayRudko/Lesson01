package com.nikolairudko.day1.console;

import com.nikolairudko.day1.entity.Point;
import com.nikolairudko.day1.entity.TimePeriod;
import com.nikolairudko.day1.service.ArithmeticServices;
import com.nikolairudko.day1.service.GeometricServices;
import com.nikolairudko.day1.service.TimeService;

import java.sql.Time;
import java.util.Calendar;

public class PrintResult {

    //task 01
    public void printLastDigitOfSquare(int value) {
        ArithmeticServices services = new ArithmeticServices();
        int lastDigit = services.lastDigitOfSquare(value);
        System.out.printf("The number - %d, the last digit of the square of the number - %d", value, lastDigit);
    }

    //task02
    public void printCountDay(int year, int month) {
        TimeService service = new TimeService();
        System.out.printf("The number of days is %d", service.dayOfMoth(year, month));
    }

    //task03
    public void printParametersOfSquare(Double area) {
        GeometricServices services = new GeometricServices();
        System.out.printf("The area of the outer square: %.3f%n", area);
        double sideOfOuterSquare = services.sideOfSquare(area);
        System.out.printf("The side of the outer square: %.3f%n", sideOfOuterSquare);
        //In this case the side of the outer square is equal to the diagonal of the inner square.
        double areaOfInnerSquare = services.areaOfSquareByDiagonally(sideOfOuterSquare);
        System.out.printf("The area of the inner square: %.3f%n", areaOfInnerSquare);
        System.out.printf("The inner square is smaller than the outer square: %.3f%n", area / areaOfInnerSquare);
    }

    //task04
    public void printEvenNumbers(int amount, int[] arrayNumbers) {
        ArithmeticServices services = new ArithmeticServices();
        System.out.printf("Are there %d even numbers in this array? The answer is - %b"
                , amount, services.countOfEvenNumbers(amount, arrayNumbers));
    }

    //task05
    public void printIsPerfectNumber(int perfectNumber) {
        ArithmeticServices services = new ArithmeticServices();
        System.out.printf("Number is perfect - %b", services.isPerfectNumber(perfectNumber));
    }

    //task06
    public void printTimePeriod(int period) {
        TimePeriod timePeriod = new TimePeriod(period);
        System.out.printf("In time:%s.", timePeriod.toString());
    }

    //task07
    public void printPoint(Point pointA, Point pointB) {
        if (pointA.vector() > pointB.vector()) {
            System.out.println(pointB.toString());
        } else if (pointB.vector() > pointA.vector()) {
            System.out.println(pointA.toString());
        } else {
            System.out.println("The points are equidistant.");
        }
    }

    //task08
    public void printSegmentFunction(double value) {
        ArithmeticServices services = new ArithmeticServices();
        System.out.printf("The value of the function for the number %.3f is %.3f.",
                value, services.segmentFunction(value));
    }

    //task09
    public void printCycleProperties(double radius) {
        GeometricServices services = new GeometricServices();
        System.out.printf("The area of cycle - %.3f.%nThe length of cycle - %.3f",
                services.areaOfCycle(radius), services.lengthOfCycle(radius));
    }

    //task10
    public void printTableValue(double valueA, double valueB, double step) {
        ArithmeticServices services = new ArithmeticServices();
        System.out.printf("|%8s|%8s|%n", "Step", "Value");
        double[] array = services.tableSteps(valueA, valueB, step);
        for (double item : array
        ) {
            System.out.printf("|%8.3f|%8.3f|%n", item, Math.tan(item));
        }
    }
}

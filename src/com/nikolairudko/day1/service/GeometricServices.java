package com.nikolairudko.day1.service;

public class GeometricServices {


    public double sideOfSquare(double area) {
        return Math.sqrt(area);
    }

    public double areaOfSquareByDiagonally(double side) {
        return Math.pow(side, 2) / 2;
    }

    public double areaOfCycle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double lengthOfCycle(double radius) {
        return 2 * Math.PI * radius;
    }
}

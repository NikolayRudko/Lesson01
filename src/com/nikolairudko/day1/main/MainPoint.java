package com.nikolairudko.day1.main;

import com.nikolairudko.day1.console.PrintResult;
import com.nikolairudko.day1.entity.Point;
import com.nikolairudko.day1.validation.Validation;

public class MainPoint {
    public static void main(String[] args) {
        Validation validation = new Validation();

        String namePoint1 = "PointA";
        String coordinateX1 = "20";
        String coordinateY1 = "15";
        String namePoint2 = "PointB";
        String coordinateX2 = "-5";
        String coordinateY2 = "16";

        if (validation.isInteger(new String[]{coordinateX1, coordinateY1, coordinateX2, coordinateY2}) &&
                validation.isStr(new String[]{namePoint1, namePoint2})) {
            PrintResult result = new PrintResult();
            result.printPoint(new Point(namePoint1, Integer.parseInt(coordinateX1), Integer.parseInt(coordinateY1)),
                    new Point(namePoint2, Integer.parseInt(coordinateX2), Integer.parseInt(coordinateY2)));
        } else {
            System.out.println("Incorrect data");
        }
    }
}

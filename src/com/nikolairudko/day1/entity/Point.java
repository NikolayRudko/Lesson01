package com.nikolairudko.day1.entity;

public class Point {
    private int coordinateX;
    private int coordinateY;
    private String name;

    public Point() {
        this.coordinateX = 0;
        this.coordinateY = 0;
        this.name = "Zero point";
    }

    public Point(String name, int coordinateX, int coordinateY) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double vector() {
        return Math.hypot(this.coordinateX, this.coordinateY);
    }

    @Override
    public String toString() {
        return String.format("Point - %s, coordinate X = %d, coordinate Y = %d", name, coordinateX, coordinateY);
    }
}
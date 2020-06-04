package com.nikolairudko.day1.entity;

public class TimePeriod {
    private int hours;
    private int minutes;
    private int seconds;

    public TimePeriod(int period) {
        this.hours = period / 3600;
        this.minutes = (period - this.hours * 3600) / 60;
        this.seconds = period - this.hours * 3600 - this.minutes * 60;
    }

    @Override
    public String toString() {
        return String.format("hours=%d, minutes=%d, seconds=%d", hours, minutes, seconds);
    }
}

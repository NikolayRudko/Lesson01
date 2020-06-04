package com.nikolairudko.day1.service;

import java.util.Calendar;

public class TimeService {
    public int dayOfMoth(int year, int month) {
        month--;
        Calendar myCalendar = (Calendar) Calendar.getInstance().clone();
        myCalendar.set(year, month, 1);
        return myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}

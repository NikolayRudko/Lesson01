package com.nikolairudko.day1.validation;

public class Validation {

    public boolean isInteger(String str) {
        if (str == null) {
            return false;
        }

        try {
            int intNum = Integer.parseInt(str);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    public boolean isInteger(String[] arrayOfStr) {
        for (String str : arrayOfStr) {
            if (!isInteger(str)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPosInt(String str) {
        return isInteger(str) && Integer.parseInt(str) >= 0;
    }

    public boolean isPosIntMoreZero(String str) {
        return isInteger(str) && Integer.parseInt(str) > 0;
    }

    public boolean isDouble(String str) {
        if (str == null) {
            return false;
        }

        try {
            double doubleNum = Double.parseDouble(str);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    public boolean isPosDoubMoreZero(String str) {
        return isDouble(str) && Double.parseDouble(str) > 0;
    }

    public boolean isStr(String str) {
        return str != null;
    }

    public boolean isStr(String[] arrayStr) {
        for (String str : arrayStr
        ) {
            if (!isStr(str)) {
                return false;
            }
        }
        return true;
    }

    public boolean isYear(String str) {
        return isPosIntMoreZero(str) && Integer.parseInt(str) < 10_000;
    }

    public boolean isMonth(String str) {
        return isPosIntMoreZero(str) && Integer.parseInt(str) <= 12;
    }
}

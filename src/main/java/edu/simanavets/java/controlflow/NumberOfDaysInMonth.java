package edu.simanavets.java.controlflow;

import edu.simanavets.java.methods.LeapYearCalculator;

public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return LeapYearCalculator.isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }
}

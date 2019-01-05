package edu.simanavets.java.methods;

public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(-525600);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = minutes / 1440;
            if (years > 0) {
                days = days - years * 365;
            }
            String result = String.format("%d min = %d y and %d d", minutes, years, days);
            System.out.println(result);
        }
    }
}

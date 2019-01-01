package edu.simanavets.java.methods;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        return Math.abs(number1 * 1000 - number2 * 1000) < 1;
    }
}

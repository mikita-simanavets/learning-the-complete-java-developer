package edu.simanavets.java.controlflow;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int dividersSum = 0;
        for (int divider = 1; divider < number; divider++) {
            if (number % divider == 0) {
                dividersSum += divider;
            }
        }

        return dividersSum == number;
    }
}

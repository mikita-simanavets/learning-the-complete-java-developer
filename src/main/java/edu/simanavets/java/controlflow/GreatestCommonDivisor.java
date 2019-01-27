package edu.simanavets.java.controlflow;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int smallestNumber = first < second ? first : second;
        int commonDivider = 1;

        for (int divider = smallestNumber; divider >= 1; divider--) {
            if (first % divider == 0 && second % divider == 0) {
                commonDivider = divider;
                break;
            }
        }

        return commonDivider;
    }
}

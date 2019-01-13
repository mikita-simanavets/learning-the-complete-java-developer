package edu.simanavets.java.controlflow;

public class DigitSumChallenge {

    // 125 / 10 == 12,5
    // -> 12 && 5
    // 12 / 10 == 1,2
    // -> 1 && 2
    // 5 + 2 + 1 == 8
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}

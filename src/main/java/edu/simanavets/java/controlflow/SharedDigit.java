package edu.simanavets.java.controlflow;

public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }

        int[] firstDigits = new int[] {first / 10, first % 10};
        int[] secondDigits = new int[] {second / 10, second % 10};
        return firstDigits[0] == secondDigits[0]
                || firstDigits[0] == secondDigits[1]
                || firstDigits[1] == secondDigits[0]
                || firstDigits[1] == secondDigits[1];
    }
}

package edu.simanavets.java.controlflow;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean firstAttempt = true;

        while (true) {
            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (firstAttempt) {
                    min = number;
                    max = number;
                    firstAttempt = false;
                }

                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }

        scanner.close();

        String result = firstAttempt
                ? "User hasn't entered any number before exit"
                : String.format("Min: %s; Max: %s", min, max);
        System.out.println(result);
    }
}

package edu.simanavets.java.controlflow;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int sum = 0;

        while (number <= 10) {
            System.out.println(String.format("Enter number #%s:", number));
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                number++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("The sum of entered numbers: " + sum);

        scanner.close();
    }
}

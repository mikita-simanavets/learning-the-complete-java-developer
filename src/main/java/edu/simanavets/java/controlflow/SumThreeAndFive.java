package edu.simanavets.java.controlflow;

public class SumThreeAndFive {

    public static void main(String[] args) {
        int sum = 0;
        int foundNumbers = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println("Found number: " + i);
                foundNumbers++;
            }
            if (foundNumbers == 5) {
                break;
            }
        }

        System.out.println("Sum of the found numbers: " + sum);
    }
}

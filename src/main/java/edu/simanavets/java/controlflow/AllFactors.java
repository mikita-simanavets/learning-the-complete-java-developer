package edu.simanavets.java.controlflow;

public class AllFactors {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            String dividers = "1";
            for (int divider = 2; divider <= number; divider++) {
                if (number % divider == 0) {
                    dividers = dividers.concat(" " + divider);
                }
            }
            System.out.println(dividers);
        }
    }
}

package edu.simanavets.java.controlflow;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(3);
        System.out.println();
        printSquareStar(5);
        System.out.println("\n");
        printSquareStar(8);
        System.out.println("\n");
        printSquareStar(25);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.print("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) {
                for (int column = 0; column < number; column++) {
                    if (row > 0 && column == 0) {
                        System.out.println();
                    }

                    if (row == 0 || row == number - 1) {
                        System.out.print("*");
                    } else if (column == 0 || column == number - 1) {
                        System.out.print("*");
                    } else if (row == column) {
                        System.out.print("*");
                    } else if (column == number - 1 - row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}

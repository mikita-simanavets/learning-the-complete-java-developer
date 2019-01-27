package edu.simanavets.java.controlflow;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(10);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);
            int leadingZeros = getDigitCount(number) - getDigitCount(reversedNumber);

            while (reversedNumber > 0) {
                switch (reversedNumber % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber /= 10;
            }

            for (int i = 0; i < leadingZeros; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        if (Math.abs(number) < 10) {
            return number;
        } else {
            int reverse = 0;
            while (Math.abs(number) > 0) {
                reverse = reverse * 10 + number % 10;
                number /= 10;
            }
            return reverse;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            return String.valueOf(number).length();
        }
    }
}

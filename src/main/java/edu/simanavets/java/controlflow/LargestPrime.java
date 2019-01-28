package edu.simanavets.java.controlflow;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int prime;
        for (prime = 2; prime <= number; prime++) {
            if (number % prime == 0) {
                number /= prime;
                prime--;
            }
        }
        return prime;
    }
}

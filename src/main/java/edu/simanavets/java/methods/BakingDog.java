package edu.simanavets.java.methods;

public class BakingDog {

    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
        System.out.println(bark(true, 24));
        System.out.println(bark(true, 22));
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking) {
            return hourOfDay >= 0 && (hourOfDay < 8 || hourOfDay == 23);
        }
        return false;
    }
}

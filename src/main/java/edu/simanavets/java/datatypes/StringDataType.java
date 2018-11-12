package edu.simanavets.java.datatypes;

public class StringDataType {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString equal to: " + myString);
        myString = myString + ". And one more string";
        System.out.println("myString equal to: " + myString);
        myString = myString + ". And even one more with copyright: \u00A9";
        System.out.println("myString equal to: " + myString + "\n");

        String numberString = "250";
        numberString = numberString + "50";
        System.out.println("The result is: " + numberString + "\n");

        int myInt = 50;
        String lastString = numberString + myInt;
        System.out.println("lastString is equal to: " + lastString);
    }
}

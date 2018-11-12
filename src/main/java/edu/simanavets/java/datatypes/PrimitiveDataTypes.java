package edu.simanavets.java.datatypes;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        // byte: 8-bit (1 byte)
        byte minByte = -128;
        byte maxByte = 127;

        // short: 16-bit (2 byte)
        short minShort = -32768;
        short maxShort = 32767;

        // int: 32-bit (4 byte)
        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;

        // long: 64-bit (8 byte)
        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;

        // float: 32-bit (4 byte)
        float minFloat = 1.4E-45f;
        float maxFloat = 3.4028235E38f;

        // double: 64-bit (8 byte)
        double minDouble = 4.9E-324d;
        double maxDouble = 1.7976931348623157E308d;

        // char - 16 bit (2 bytes)
        char minChar = '\u0000';
        char maxChar = '\uffff';

        // boolean: true, false
        boolean trueBoolean = true;
        boolean falseBoolean = false;

        primitivesNumbersChallenge();
        primitivesCharChallenge();
        primitivesBooleanChallenge();
    }

    private static void primitivesBooleanChallenge() {
        boolean myBoolean = true;
        System.out.println("My boolean is " + myBoolean);
    }

    private static void primitivesCharChallenge() {
        char copyright = '\u00A9';
        System.out.println("Copyright symbol: " + copyright);

        char registered = '\u00AE';
        System.out.println("Registered symbol: " + registered + "\n");
    }

    private static void primitivesNumbersChallenge() {
        int myIntValue = 5 / 2;
        float myFloatValue = (float) 5.4;
        double myDoubleValue = 5.25;

        float myFloatValue2 = 5f / 3;
        double myDoubleValue2 = 5d / 3;

        System.out.println("int = " + myIntValue);
        System.out.println("float = " + myFloatValue2);
        System.out.println("double = " + myDoubleValue2);

        double pounds = 200d;
        double kilograms = pounds * 0.45_359_237d;
        System.out.println(String.format("%s pound(s) is equal to %s kilograms\n", pounds, kilograms));
    }
}

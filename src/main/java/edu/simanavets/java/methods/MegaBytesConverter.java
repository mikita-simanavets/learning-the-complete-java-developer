package edu.simanavets.java.methods;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(1);
        printMegaBytesAndKiloBytes(1024);
    }

    private static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            String message = String.format("%s KB = %s MB and %s KB", kiloBytes, megabytes, remainingKilobytes);
            System.out.println(message);
        }
    }
}

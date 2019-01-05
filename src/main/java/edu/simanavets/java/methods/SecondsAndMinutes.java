package edu.simanavets.java.methods;

public class SecondsAndMinutes {

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int hours = 0;
        if (minutes > 59) {
            hours = minutes / 60;
            minutes = minutes % 60;
        }

        return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
    }

    public static String getDurationString(int seconds) {
        return getDurationString(seconds / 60, seconds % 60);
    }
}

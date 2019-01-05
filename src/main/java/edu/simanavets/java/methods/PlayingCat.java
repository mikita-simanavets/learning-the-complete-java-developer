package edu.simanavets.java.methods;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25) {
            return (summer && temperature <= 45) || (!summer && temperature <= 35);
        }
        return false;
    }
}

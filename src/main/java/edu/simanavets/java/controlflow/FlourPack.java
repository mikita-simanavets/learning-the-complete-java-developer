package edu.simanavets.java.controlflow;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        for (int b = 0; b <= bigCount; b++) {
            for (int s = 0; s <= smallCount; s++) {
                if ((b * 5) + (s * 1) == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}

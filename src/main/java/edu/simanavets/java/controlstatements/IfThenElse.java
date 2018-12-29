package edu.simanavets.java.controlstatements;

public class IfThenElse {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelComplicated = 8;
        int bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelComplicated * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}

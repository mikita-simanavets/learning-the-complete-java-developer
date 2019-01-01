package edu.simanavets.java.methods;

public class MethodsChallenge {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50

        displayHighScorePosition("Dave-1", calculateHighScorePosition(1500));
        displayHighScorePosition("Dave-2", calculateHighScorePosition(900));
        displayHighScorePosition("Dave-3", calculateHighScorePosition(400));
        displayHighScorePosition("Dave-4", calculateHighScorePosition(50));

        displayHighScorePosition("Bound-1", calculateHighScorePosition(1000));
        displayHighScorePosition("Bound-2-1", calculateHighScorePosition(999));
        displayHighScorePosition("Bound-2-2", calculateHighScorePosition(500));
        displayHighScorePosition("Bound-3", calculateHighScorePosition(100));
        displayHighScorePosition("Bound-4", calculateHighScorePosition(99));
    }

    private static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    private static void displayHighScorePosition(String name, int position) {
        String message = String.format("%s managed to get into position %s on the high score table", name, position);
        System.out.println(message);
    }
}

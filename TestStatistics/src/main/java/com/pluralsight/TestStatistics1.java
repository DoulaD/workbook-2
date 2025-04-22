package com.pluralsight;

import java.util.Arrays;

public class TestStatistics1 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 78, 87, 72, 69, 92};
        Arrays.sort(scores);


//        Shorter way to wrtite this
        double total = 0;
        for (int score:scores){
            total += total;
            System.out.println(score);
        }

        int numberOfScores = scores.length;
        double average = total/numberOfScores;
        System.out.println("Average Score: " + average);

        int lowScore = scores[0];
        int highScore = scores[scores.length-1];

        System.out.println("Low Scores " + lowScore);
        System.out.println("High Scores " + highScore);

//        for (int  i=0; i < scores.length; i++) {
//            int score = scores[i];
//            System.out.println(score);
//        }
    }
}

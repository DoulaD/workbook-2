package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

int[] scores = {97, 90, 83, 95, 65, 85, 77, 88, 100};

int sum = 0;
int high = scores[0];
int low = scores[0];

for (int score: scores) {
    sum += score;

    if (score > high) high = score;
    if (score < low) low = score;

    double average =(double) sum/ scores.length;

    System.out.println("Average " + average );
    System.out.println("High Score " + high );
    System.out.println("Low Score " + low);

}




    }
}

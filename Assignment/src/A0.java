import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class A0 {

    public static int calculateAverage(int[] scores){
        int studentAvg = 0;
        for (int i = 0; i < scores.length; i++) {
            studentAvg += scores[i];
        }
        studentAvg /= scores.length;
        return studentAvg;
    }

    public static int findHighestScore(int[] scores){
        int max = scores[0];
        for (int i = 0; i < scores.length-1; i++) {
            if(max < scores[i+1]) max = scores[i+1];
        }
        return max;
    }

    public static int findLowestScore(int[] scores){
        int min = scores[0];
        for (int i = 0; i < scores.length-1; i++) {
            if(min > scores[i+1]) min = scores[i+1];
        }
        return min;
    }

    public static int countAboveAverage(int[] scores, int average){
        int counter = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > average) counter++;
        }
        return counter;
    }

    public static void printGradesAboveThreshold(int[] scores, int threshold){
        int counter = 0;
        int[] temp = new int[scores.length];
        System.out.print("Scores above "+ threshold + ": ");
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > threshold){
                temp[counter] = scores[i];
                counter++;
            }
        }
        int[] scoresAboveAvg = new int[counter];
        for (int i = 0; i < scoresAboveAvg.length; i++) {
            scoresAboveAvg[i] = temp[i];
            if(i < scoresAboveAvg.length - 1){
                System.out.print(scoresAboveAvg[i]+", ");
            } else{
                System.out.print(scoresAboveAvg[i]);
            }
        }
    // I do all of above just to avoid printing the last comma. For example:  "Scores above #threshold: 1,2,3, <- this comma should be avoided
    }

    public static void main(String[] args) {
        int[] students = new int[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = (int)(Math.random()*101); // random could not generate 1.0, therefore should time 101 instead of 100
        }
        System.out.println(Arrays.toString(students)); // just for displaying and verifying, not part of the assignment

        int average = calculateAverage(students);
        int highestScore = findHighestScore(students);
        int lowestScore = findLowestScore(students);
        int numAboveAverage = countAboveAverage(students, average);

        System.out.printf("Average Score: %d%nHighest Score: %d%nLowest Score: %d%nNumber of Students Scoring Above Average: %d%n", average,highestScore,lowestScore,numAboveAverage);
        printGradesAboveThreshold(students,60);
        
    }
}

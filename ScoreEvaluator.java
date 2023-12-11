import java.util.Scanner;

// Create the class name ScoreEvaluator
public class ScoreEvaluator {
    // Create the main class
    public static void main(String[] args) {
        // Set up the String array for class one names
        String[] classOneNames = {"Maria", "Harry", "Lisa", "Chuck"};
        // Set up the double array for class one scores
        double[][] classOneScores = {
                {100.0, 87.5, 95.3, 80.0},
                {95.6, 25.0, 70.7, 85.0},
                {95.3, 96.7, 82.6, 87.5},
                {61.8, 55.9, 60.1, 60.6}
        };
        // Print to display for class one information and call method
        System.out.println("Displaying information for Class One");
        processScores(classOneNames, classOneScores);
        // Set up the String array for class two names
        String[] classTwoNames = {"Tony", "Steven", "Natasha"};
        // Set up the double array for class two scores
        double[][] classTwoScores = {
                {97.2, 67.3, 89.0, 92.3, 100.0},
                {80.6, 76.0, 90.0, 35.0, 83.5},
                {96.7, 91.5, 99.0, 97.0, 92.3}
        };
        // Print to display for class two information and call method
        System.out.println("Displaying information for Class Two");
        processScores(classTwoNames, classTwoScores);

    }

    // Create the void processScores method with parameters
    public static void processScores(String[] names, double[][] scores) {
        // Use for loop to show students names
        for (int i = 0; i < names.length; i++) {
            // Declare the variables
            double sum = 0.0;
            double average = 0.0;
            char status = 'P';

            // Print the Student name and the result of student score information
            System.out.println("\nStudent: " + names[i]);
            System.out.print("Scores:");
            // Use for loop to show the student scores and check score grades
            for (int j = 0; j < scores[i].length; j++) {
                // Check the student score of 97 and above for grade A+ and print the result
                if (scores[i][j] >= 97) {
                    System.out.print("\tA+");
                    // Check the student score of between 93 and 96 for grade A and print the result
                } else if (scores[i][j] >= 93 && scores[i][j] < 97) {
                    System.out.print("\tA");
                    // Check the student score of between 90 and 92 for grade A- and print the result
                } else if (scores[i][j] >= 90 && scores[i][j] < 93) {
                    System.out.print("\tA-");
                    // Check the student score of between 87 and 89 for grade B+ and print the result
                } else if (scores[i][j] >= 87 && scores[i][j] < 90) {
                    System.out.print("\tB+");
                    // Check the student score of between 83 and 86 for grade B and print the result
                } else if (scores[i][j] >= 83 && scores[i][j] < 87) {
                    System.out.print("\tB");
                    // Check the student score of between 80 and 82 for grade B- and print the result
                } else if (scores[i][j] >= 80 && scores[i][j] < 83) {
                    System.out.print("\tB-");
                    // Check the student score of between 77 and 79 for grade C+ and print the result
                } else if (scores[i][j] >= 77 && scores[i][j] < 80) {
                    System.out.print("\tC+");
                    // Check the student score of between 70 and 76 for grade C and print the result
                } else if (scores[i][j] >= 70 && scores[i][j] < 77) {
                    System.out.print("\tC");
                    // Check the student score of between 67 and 69 for grade D+ and print the result
                } else if (scores[i][j] >= 67 && scores[i][j] < 70) {
                    System.out.print("\tD+");
                    // Check the student score of between 60 and 66 for grade D and print the result
                } else if (scores[i][j] >= 60 && scores[i][j] < 67) {
                    System.out.print("\tD");
                    // Check the student score of lower than 60 for grade F and print the result
                } else if (scores[i][j] < 60) {
                    System.out.print("\tF");
                    status = 'F';
                }
            }
            System.out.println();

            // Calculate tha individual student of average score and print the result
            average = getAverage(scores[i]);
            System.out.println("Average: " + average);

            // Check the individual student of average score and grade to determine pass of fail
            if (isFail(average, status)) {
                System.out.println("Status:" + " Pass");

            } else {
                System.out.println("Status:" + " Fail");
            }
        }
        System.out.println();
    }
    // Calculate tha individual student of total Score
    public static double getAverage(double[] scores) {
        double sum = 0;
        double average = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        // Calculate the average
        average = sum / scores.length;
        return average;
    }

    // Check the individual student pass or fail
    public static boolean isFail(double average, char status) {
        if (average < 40 || status == 'F') {
            return false;
        } else {
            return true;
        }
    }
}

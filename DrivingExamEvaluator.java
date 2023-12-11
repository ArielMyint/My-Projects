
// Project-2

import java.util.Scanner;

        public class DrivingExamEvaluator {
            public static void main(String[] args) {
                //Create the Scanner object
                Scanner input = new Scanner(System.in);
                String UserName;
                String DefaultNm = "DEFAULT USERNAME";
                double writtenExamScore;
                double practiceExamScore;
                double overallExamScore;
                // Ask the user name
                System.out.println("Please Enter the student's username: ");
                UserName = input.nextLine();
                if (UserName.length() > 50) {
                    UserName = DefaultNm;
                    System.out.println(UserName);
                }
                // Ask the written exam score
                System.out.println("Enter your written exam score: ");
                writtenExamScore = input.nextDouble();
                if (writtenExamScore < 0) {
                    writtenExamScore = 0;
                } else if (writtenExamScore > 750) {
                    writtenExamScore = 750;
                }
                // Calculate the Percentage of written exam score
                writtenExamScore = (writtenExamScore * 0.31);
                // Ask for practical exam score
                System.out.println("Enter your practical exam score: ");
                practiceExamScore = input.nextDouble();
                if (practiceExamScore < 0)
                    practiceExamScore = 0;
                else if (practiceExamScore > 750)
                    practiceExamScore = 750;
                // Calculate the Percentage of percentage practical exam score
                practiceExamScore = (practiceExamScore * 0.69);
                // Calculate the overall Percentage of written & practical exam score
                overallExamScore = (writtenExamScore + practiceExamScore);
                // Show the result of a student for the driving exam
                System.out.println("\nThe student's username is " + UserName + ".");
                System.out.println(UserName + "'s written exam score is " + writtenExamScore + " percent.");
                System.out.println(UserName + "'s practical exam score is " + practiceExamScore + " percent.");
                System.out.println(UserName + " gets the overall exam score is " + overallExamScore + " percent.");
                // Show the result of the student is pass or fail
                if (overallExamScore >= 0.67 * 750) {
                    System.out.println("\nSo, " + UserName + " meets the minimum 67 percent requirement of 750 raw maximum score and pass the driving exam.");
                } else
                    System.out.println("\nSo, " + UserName + " doesn't meet the minimum 67 percent requirement of 750 raw maximum score and fail the driving exam.");
            }
        }


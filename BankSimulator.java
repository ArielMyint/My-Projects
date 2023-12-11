// Project-3

import java.util.Scanner;

public class BankSimulator {
    public static void main(String[] args) {
        // Create the Scanner object and name the variable
        Scanner input = new Scanner(System.in);
        char function;
        double balance = 300;

        // Set the char's alphabets to do function for the user's choices
        System.out.println("What would you like to do with the account?");
        System.out.println("Enter one of the following choices: ");
        System.out.println("-B to check your balance.");
        System.out.println("-D to make a deposit.");
        System.out.println("-W to make a withdrawal.");
        System.out.println("-Q to exit the program.");

        // Set up the boolean
        boolean programRun = true;
        System.out.println("Your choice: ");
        function = input.next().charAt(0);

        // Use the while loop and switch statements
        while (programRun) {
            switch (function) {
                case 'B': // Set up char 'B' for the balance
                    System.out.println("Your balance is " + balance);
                    break;
                case 'D': // Set up char 'D' for the deposit
                    System.out.println("How much do you want to deposit?");
                    double deposit = input.nextDouble();
                    // Create 'if/ else if' to set up the minimum amount to deposit
                    if (deposit <= 0) {
                        System.out.println("Please wnter the amount greater than zero.");
                    } else {
                        balance = balance + deposit;
                        System.out.println("Your new balance is " + balance);
                    }
                    break;
                case 'W': // Set up char 'W' for the withdrawal
                    System.out.println("How much do you want to withdrawal?");
                    double withdrawal = input.nextDouble();
                    // Create 'if/ else if' to set up the minimum amount to withdrawal
                    if (withdrawal <= 30 || withdrawal > balance) {
                        System.out.println("The transaction fails due to going below $30.");
                    } else {
                        balance = balance - withdrawal;
                        System.out.println("Your new balance is " + withdrawal);
                    }
                    break;
                case 'Q': // Set up char 'Q' for the quit the exam
                    System.out.println("Exiting the program");
                    programRun = false;
                    return;
                default:
                    System.out.println("Other");
                    System.out.println("\nYour Choice is " + function);
            }
            System.out.println("\nWhat would you like to do with the account?");
            System.out.println("Enter one of the following choices: ");
            System.out.println("-B to check your balance.");
            System.out.println("-D to make a deposit.");
            System.out.println("-W to make a withdrawal.");
            System.out.println("-Q to exit the program.");
            function = input.next().charAt(0);
        }
    }
}


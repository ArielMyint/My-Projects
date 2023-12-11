import java.util.Scanner;
// Crete the class name
public class DiceGame {
    //Create the void main class
    public static void main(String[] args) {
        //Give a greeting message to the user for the dice game
        System.out.println("Welcome! You are about to play the dice game.");
        //Give the information to the user how many points to begin with
        System.out.println("All the games begin with 100 points");
        int totalAmount = 100;
        //Creat a new Scanner object
        Scanner input = new Scanner(System.in);
        //Ask the user to enter the bet amount as integer
        System.out.println("Please enter your bet amount");
        System.out.print("Your bet: ");
        int betAmount = input.nextInt();
        //Use while loop to be continuously asked the user to enter a valid value
        while (true) {
            //Check the bet amount is greater than zero and less than or equal total amount
            if (betAmount > 0 && betAmount <= totalAmount) {
                //Call the diceRoll function
                int diceValue = diceRoll();
                System.out.println("Dice Value: " + diceValue);
                //Use switch case for the game result
                switch (diceValue) {
                    //the dice value results in 6, the user will get 2 times of bet amount
                    case 6:
                        totalAmount += betAmount * 2;
                        System.out.println("Total: " + totalAmount);
                        break;
                    //the dice value results in 5, the user will get 1 time of bet amount
                    case 5:
                        totalAmount += betAmount;
                        System.out.println("Total: " + totalAmount);
                        break;
                    //the dice value results in 4, the user will get 1 time of bet amount
                    case 4:
                        totalAmount += betAmount;
                        System.out.println("Total: " + totalAmount);
                        break;
                    //the dice value results in 3, the user will not lose or win the points
                    case 3:
                        System.out.println("Total: " + totalAmount);
                        break;
                    //the dice value results in 2, the user will lose all the bet amount
                    case 2:
                        totalAmount -= betAmount;
                        System.out.println("Total: " + totalAmount);
                        break;
                    //the dice value results in 1, the user will lose all the bet amount
                    case 1:
                        totalAmount -= betAmount;
                        System.out.println("Total: " + totalAmount);
                        break;
                }
                //if the user put the amount of less than or equal to zero, ask to try again
            } else if (betAmount <= 0) {
                System.out.println("Please try again and enter the valid value");

                //if the user put the amount of greater than total amount, ask the user to try again for the lower bet
            } else if (betAmount > totalAmount) {
                System.out.println("Please try again and lower your bet vale and enter the valid value");
            }
            //if the total amount is equal to zero, it stops
            if (totalAmount == 0) {
                break;
            }
            //Ask the user to enter the bet amount as integer
            System.out.print("Your bet: ");
            betAmount = input.nextInt();
        }
    }
    /* Create the diceRoll method,
    use the math random for dice game,
     and return random value
     */
    public static int diceRoll() {
        int randomValue = 1 + (int) (Math.random() * 6);
        return randomValue;
    }
}


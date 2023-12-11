
// Project 6

import java.util.Scanner;

// Create the class name
public class StoreProgram {
    // Create the void main class
    public static void main(String[] args) {
        // Set up the String array for store items
        String[] storeItems = {
                "broccoli", "onion", "carrot", "turnip", "mango",
                "bread", "garlic", "celery", "apple", "banana",
                "raisins", "grapes", "lemon", "orange", "potato"
        };
        // Set up the integer array for item quantities
        int[] itemQuantities = {
                23, 5, 7, 15, 2,
                13, 13, 8, 20, 30,
                3, 25, 10, 9, 1
        };
        // Set up the double array for item prices
        double[] itemPrices = {
                2.0, 0.89, 0.70, 1.50, 2.99,
                3.45, 1.45, 1.12, 3.99, 0.25,
                4.99, 7.00, 1.75, 1.80, 3.25
        };
        // Call the run method
        run(storeItems, itemQuantities, itemPrices);
    }

    // Create the void run method with parameters
    public static void run(String[] storeItems, int[] itemQuantities, double[] itemPrices) {
        // USe boolean and while loop to run the program
        boolean isEnable = true;
        while (isEnable) {
            // Give the information to the user
            System.out.println("\nWhat would you like to do?");
            System.out.println("1.Display all inventory ");
            System.out.println("2.Display inventory with lower than 5 quantities");
            System.out.println("3.Display highest and lowest inventory value items");
            System.out.println("4.Display total inventory value");
            System.out.println("5.Exit");

            // Creat a new Scanner object
            Scanner input = new Scanner(System.in);
            // Ask the user to choose the options
            System.out.print("Your choice: ");
            int choice = input.nextInt();
            // Use switch case for the inventory results
            switch (choice) {
                // if the user choose 1 and will give the result of all the inventory
                case 1:
                    displayInventory(storeItems, itemQuantities, itemPrices);
                    break;
                // if the user choose 2 and will give the result of low inventory
                case 2:
                    displayLowInventory(storeItems, itemQuantities, itemPrices);
                    break;
                // if the user choose 3 and will give the result of the highest inventory
                case 3:
                    displayHighestLowest(storeItems, itemQuantities, itemPrices);
                    break;
                // if the user choose 4 and will give the result of total inventory
                case 4:
                    displayTotalInventory(storeItems, itemQuantities, itemPrices);
                    break;
                // if the user choose 5 to stop the program and show appreciation for using it
                case 5:
                    System.out.println("Thank you for using the program!");
                    isEnable = false;
                    break;
                //if the user input the wrong choice, the program display to choose the valid one
                default:
                    System.out.println("You didn\'t choose the valid option. Please try again.");
            }
        }
    }

    // Create the void displayInventory with parameters
    static void displayInventory(String[] storeItems, int[] itemQuantities, double[] itemPrices) {
        // Use for loop to show all the inventory items and print the output
        for (int i = 0; i < storeItems.length; i++) {
            System.out.printf("%-10s %-10s %-10s\n", "Item: " + storeItems[i], "\t Quantity: " + itemQuantities[i], " \t\tPrice: $" + itemPrices[i]);
        }
    }

    // Create the void displayLowInventory with parameters
    static void displayLowInventory(String[] storeItems, int[] itemQuantities, double[] itemPrices) {
        // Use for loop & if statement to show the highest value , then print the output
        for (int i = 0; i < itemQuantities.length; i++) {
            if (itemQuantities[i] < 5) {
                System.out.printf("%-10s %-10s %-10s\n", "Item: " + storeItems[i], "\t Quantity: " + itemQuantities[i], " \t\tPrice: $" + itemPrices[i]);

            }
        }
    }

    // Create the void displayHighestInventory with parameters
    static void displayHighestLowest(String[] storeItems, int[] itemQuantities, double[] itemPrices) {
        double max = itemPrices[0];
        int index = 0;
        // Use for loop & if statement to show the highest value, then print the output
        for (int i = 1; i < itemPrices.length; i++) {
            if (itemPrices[i] > max) {
                max = itemPrices[i];
                index = i;
            }
        }
        System.out.println("Item: " + storeItems[index] + "\t" + "  Quantity: " + itemQuantities[index] + "\t" + " Price: $" + itemPrices[index]);
        double min = itemPrices[0];
        // Use for loop & if statement to show the lowest value, then print the output
        for (int i = 1; i < itemPrices.length; i++) {
            if (itemPrices[i] < min) {
                min = itemPrices[i];
                index = i;
            }
        }
        System.out.println("Item: " + storeItems[index] + "\t" + "  Quantity: " + itemQuantities[index] + "\t" + " Price: $" + itemPrices[index]);
    }

    // Create the void displayInventory with parameters
    static void displayTotalInventory(String[] storeItems, int[] itemQuantities, double[] itemPrices) {
        double sumTotal = 0.0;
        // Use for loop to show all the inventory and sum total of all inventory value
        for (int i = 0; i < itemPrices.length; i++) {
            sumTotal += itemPrices[i];
        }
        // Print the sumTotal value
        System.out.println(sumTotal);
    }
}


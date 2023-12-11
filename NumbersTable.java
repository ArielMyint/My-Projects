import java.util.Scanner;
// Create the class of NumbersTable
public class NumbersTable {
    // Create the main class
    public static void main(String[] args) {
        // Create the Scanner input
        Scanner input = new Scanner(System.in);

        int row = 0;
        String rowInput = "";

        // Use do- while loop
        do {
            // USe try and catch for Exception Handling
            try {
                // Ask the user input for the number of rows
                System.out.println("Please enter the number of rows.");
                System.out.print("Your input: ");
                rowInput = input.next();
                row = Integer.parseInt(rowInput);

                // Check the condition for the row between 1 and 9
                if (row < 1 || row > 9) {
                    System.out.println("Please enter a value between 1 and 9.");
                } // If the user does ot input the integer value and ask again to make it right
            } catch (Exception e) {
                System.out.println("You did not enter an integer value. Please try again.");
            }
        }
        while (row < 1 || row > 9);

        int column = 0;
        String columnInput = "";
        // Use do- while loop
        do {
            // Use try and catch for Exception Handling
            try {
                // Ask the user input for the number of columns
                System.out.println("Please enter the number of column.");
                System.out.print("Your input: ");
                columnInput = input.next();
                column = Integer.parseInt(columnInput);
                // Check the condition for the column between 1 and 9
                if (column < 1 || column > 9) {
                    System.out.println("Please enter a value between 1 and 9.");
                }
                // If the user does ot input the integer value and ask again to make it right
            } catch (Exception e) {
                System.out.println("You did not enter an integer value. Please try again.");
            }
        }
        while (column < 1 || column > 9);

        int[][] array = new int[row][column];

        // Create the 2D array for random numbers for a table
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int random = (int) (Math.random() * 9);
                array[i][j] = random;
            }
        }
        // Print the header of Random integers table
        System.out.println("Random integers table:");
        // Header number columns for a table
        for (int i = 1; i <= column; i++) {
            if (i == 1) {
                System.out.print("   " + "|" + "   " + i);
            } else {
                System.out.print("   " + i);
            }
        }
        System.out.println();

        // Create a line to divide the header number columns and random numbers
        for (int i = 0; i <= column; i++) {
            System.out.print("----");
        }
        System.out.println();

        // Use a 2D array for to print the random integers
        for (int i = 0; i < row; i++) {
            System.out.print((i + 1) + "  " + "|");
            for (int j = 0; j < column; j++) {
                System.out.print("   " + array[i][j]);
            }
            System.out.println();
        }

        // Use a for-loop to count the numbers of times
        for (int x = 0; x <= 9; x++) {
            int count = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (x == array[i][j]) {
                        count += 1;
                    }
                }
            }
            // Print the output of numbers of times in a table
            System.out.println(x + " -> " + count + " times");
        }
    }
}








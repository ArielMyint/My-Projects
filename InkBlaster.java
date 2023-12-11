import java.util.Scanner;

// Create the class of InkBlaster
public class InkBlaster {
    // Create the main class
    public static void main(String[] args) {
        // Create the new scanner object and print the output
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter side length for row and column: ");
        int sideLength = scan.nextInt();

        // Set up the 2D array grid and call the functions
        char[][] grid = generateUnpaintedGrid(sideLength);
        displayGrid(grid);

        // Check the condition  with boolean
        boolean isExit = true;
        // Run the program when it is true
        while (isExit) {
            // Assign the variable values
            int row = 0, column = 0;
            // As the user to enter th row and print the output
            System.out.println("Please enter the row: ");
            row = scan.nextInt();

            // Run the program to get the valid values
            while (true) {
                // Check the condition to get the valid value
                if (row < 1 || row > sideLength) {
                    System.out.println("You did not enter a row between the range of 1 and " + sideLength);
                    System.out.println("Please enter the row: ");
                    row = scan.nextInt();
                } else {
                    break;
                }
            }
            // As the user to enter th column and print the output
            System.out.println("Please enter the column: ");
            column = scan.nextInt();
            // Run the program to get the valid values
            while (true) {
                // Check the condition to get the valid value
                if (column < 1 || column > sideLength) {
                    System.out.println("You did not enter a column between the range of 1 and " + sideLength);
                    System.out.println("Please enter the column: ");
                    column = scan.nextInt();
                } else {
                    break;
                }
            }
            // Call the methods
            paintGrid(grid, row, column);
            displayGrid(grid);
            // Ask the user to continue or not
            System.out.println("Would you like to continue?");
            System.out.println("1 for yes, 0 for no");
            int input = scan.nextInt();
            // Check condition 1 to continue the program
            if (input == 1) {
                isExit = true;
                // Check condition 0 to stop the program
            } else if (input == 0) {
                isExit = false;
            } else {
                // Check condition if the user input invalid number and ask until to get right value
                while (true) {
                    System.out.println("Please enter the valid number of 1 or 0");
                    input = scan.nextInt();

                    if (input == 1) {
                        isExit = true;
                        break;
                    } else if (input == 0) {
                        isExit = false;
                        break;
                    }
                }
            }
        }
    }

    // Create the method char 2D array generateUnpaintedGrid with argument with return value
    public static char[][] generateUnpaintedGrid(int sideLength) {
        char[][] grid = new char[sideLength][sideLength];
        for (int i = 0; i < sideLength; i++)
            for (int j = 0; j < sideLength; j++)
                grid[i][j] = '0';
        return grid;
    }

    // Create the method void displayGrid with argument
    public static void displayGrid(char[][] grid) {
        // Use for loops to get the grid and print the output
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++)
                System.out.print(grid[i][j] + " ");
            // To print out the another line
            System.out.println();
        }
    }

    // Create the method void paintGrid with arguments
    public static void paintGrid(char[][] grid, int row, int col) {
        // Set up for the user starting from 1 (not from 0)
        row = row - 1;
        col = col - 1;

        //
        grid[row][col] = 'x';
        // // Check for the edge value assign the right value to paint the grid
        if (row == 0) {
            grid[row + 1][col] = 'x';
        }
        // // Check for the edge value assign the bottom value to paint the grid
        if (col == 0) {
            grid[row][col + 1] = 'x';
        }
        // Check for the edge value assign the left value to paint the grid
        if (row == grid.length - 1) {
            grid[row - 1][col] = 'x';
        }
        // Check for the edge value assign the top value to paint the grid
        if (col == grid.length - 1) {
            grid[row][col - 1] = 'x';
        }
        // Assign the bottom and bottom value to paint the grid
        if (col < grid.length - 1 && col > 0) {
            grid[row][col + 1] = 'x';
            grid[row][col - 1] = 'x';
        }
        // Assign the right value to paint the grid
        if (row < grid.length - 1 && row > 0) {
            grid[row + 1][col] = 'x';
            grid[row - 1][col] = 'x';
        }
    }
}


import java.util.Scanner;

// Create class name
public class CashRegisterPartTwo {
    // Create the main method
    public static void main(String[] args) {

        runTransaction();
    }

    // Create the runTransaction method (no return)
    public static void runTransaction() {

        // Declare the variables
        int packageQuantity = 23;
        double price = 28.60;

        // Create the Scanner object
        Scanner input = new Scanner(System.in);
        String userName;

        // Ask the user name and input user name
        System.out.println("Please enter your name: ");
        userName = input.nextLine();

        // Give more detail about the item before the user buy it
        System.out.println("My store sells only cheesecake.");
        System.out.println("The price of each item is $28.60.");
        System.out.println("The items are only available in packages.");
        System.out.println("The package contains 23 items.");

        // Ask the user how many packages want to buy and input the number
        System.out.println("\n If you want to purchase, enter number of packages");
        int numPackagesOrdered = input.nextInt();

        // Call the methods to print out the values
        double preTaxTotal = computePreTaxTotal(numPackagesOrdered, packageQuantity, price);
        double specialTax = computeTax(preTaxTotal);
        double totalCost = preTaxTotal + specialTax;
        displayTransactionSummary(numPackagesOrdered, price * packageQuantity, preTaxTotal, specialTax, totalCost);

    } // Create the computePreTaxTotal method (return) w/ perimeters

    public static double computePreTaxTotal(int numPackagesOrdered, int packageQuantity, double price) {
        return numPackagesOrdered * packageQuantity * price;

    }// Create the computeTax method (return) w/ perimeter

    public static double computeTax(double preTaxTotal) {
        double normalTax = 15.75 / 100;
        double normalTaxAmount = normalTax * preTaxTotal;
        return (normalTaxAmount / 3.32) + 3.91;

    } // Create the displayTransactionSummary method (no return) w/ perimeters

    public static void displayTransactionSummary(int numPackagesOrdered, double price, double preTaxTotal, double tax, double totalCost) {

        /*
          Print the output of
           -number of packages the customer ordered
           -price for each package
           -pre tax total
           - total cost of the sale
         */
        System.out.println("The number of package you order: " + numPackagesOrdered);
        System.out.println("The price of each package is: " + "$" + price);
        System.out.println("Your pre-tax total is: " + "$" + preTaxTotal);
        System.out.println("Your total cost of the sale is: " + "$" + totalCost);

        // Acknowledge of the customer purchase and give the suggestion for the drink to along with it
        System.out.println("\n Thanks for your purchase! I would recommend to buy any kind of soda that is good with this cheesecake.");
    }
}

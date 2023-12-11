
// Project-1

import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {
        // Create the Scanner object
        Scanner input = new Scanner(System.in);
        String userName;

        int numberOfPackages;
        int numberOfItems;
        double priceOfTheItem = 28.60;
        double preTaxTotal;
        double normalTaxAmount;
        double taxRate;
        double specialTaxAmount;
        double totalCostOfTheSale;
        double priceOfEachPackage = 23 * 28.60;

        System.out.println("Please enter your name");
        userName = input.nextLine();

        /*
         * Describe the sold item
         * Describe price of each item
         * Describe the items of each package & only sell for packages
         * Ask the packages the user want to buy
         */

        System.out.println("My store sells only cheesecake.");
        System.out.println("The price of each item is $28.60.");
        System.out.println("The items are only available in packages.");
        System.out.println("The package contains 23 items.");

        System.out.println("\nIf you want to purchase, enter number of packages.");
        numberOfPackages = input.nextInt();

        numberOfItems = numberOfPackages * 23;
        taxRate = 15.75 / 100;
        preTaxTotal = priceOfTheItem * numberOfItems;
        normalTaxAmount = preTaxTotal * taxRate;
        specialTaxAmount = (normalTaxAmount / 3.32) + 3.91;
        totalCostOfTheSale = preTaxTotal + specialTaxAmount;

        System.out.println("The number of package you order: " + numberOfPackages);
        System.out.println("The price of each package is: " + priceOfEachPackage);
        System.out.println("Your pre-tax total is: " + "$" + preTaxTotal);
        System.out.println("Your taxes associated with the sale is: " + "$" + normalTaxAmount);
        System.out.println("Your total cost of the sale is: " + "$" + totalCostOfTheSale);

        System.out.println("\nThank you for your purchase " + userName + "! I would recommend to buy any kind of soda that is good with this cheesecake.");
    }
}


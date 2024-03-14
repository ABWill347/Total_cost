package totalcost;

import java.util.Scanner;

public class Total_Cost {
    public static void main(String[] args) {
        //   WRITE A PROGRAM THAT CALCULATES TOTAL COST OF USER'S ITEMS
        /*String product = "Rice";
        int price = 25;
        int qty = 1;
        int miles = 1;
        */
        Scanner scan = new Scanner(System.in);
        // Prompt user for item name
        System.out.println("Enter the item name:");
        String product = scan.nextLine();

        // Prompt user for quantity
        System.out.println("Enter the quantity you wish:");
        int qty = scan.nextInt();

        // Prompt user for price per item
        System.out.println("Enter the price per item:");
        int price = scan.nextInt();

        // Prompt user for miles for delivery
        System.out.println("Enter the miles for delivery:");
        int miles = scan.nextInt();

        // Fee for Distance
        int fee;
        if (miles <= 4) {
            fee = 2;
        } else if (miles <= 15) {fee = 5;
        } else if (miles <= 25) {fee = 10;
        } else if (miles <= 50) {fee = 15;
        } else {fee = 20;
        }

        // Total price
        int total = price * qty + fee;


        System.out.println(qty + " "+  product  + " Is $" + total);
        // Total cost for all printed out
        System.out.println("Item: " + product);
        System.out.println("Quantity: " + qty);
        System.out.println("Price per item: $" + price);
        System.out.println("Miles for delivery: " + miles);
        System.out.println("Total Cost: $" + total);

        // Close scanner
        scan.close();
    }
}




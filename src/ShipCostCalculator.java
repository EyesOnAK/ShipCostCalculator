import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        // Pseudocode:
        // class ShipCostCalculator
        //   main()
        //     num itemPrice = 0.0
        //     num shipCost = 0.0
        //     num totalPrice = 0.0
        //     String trash = ""
        //     output "Enter the item price: "
        //     if hasNextDouble() then
        //       input itemPrice
        //       if itemPrice >= 100 then
        //         shipCost = 0
        //       else
        //         shipCost = itemPrice * 0.02
        //       endIf
        //       totalPrice = itemPrice + shipCost
        //       output "Shipping cost is: $" + shipCost
        //       output "Total price is: $" + totalPrice
        //     else
        //       input trash
        //       output "Invalid price entered: " + trash
        //     endIf
        //   return
        // endClass

        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double shipCost = 0.0;
        double totalPrice = 0.0;
        String trash = "";

        System.out.print("Enter the item price: ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear input buffer

            if (itemPrice >= 100.0) {
                shipCost = 0.0;
            } else {
                shipCost = itemPrice * 0.02;
            }
            totalPrice = itemPrice + shipCost;

            System.out.printf("Shipping cost: $%.2f%n", shipCost);
            System.out.printf("Total price: $%.2f%n", totalPrice);
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid input: " + trash);
            System.out.println("Run the program again and enter a valid number!");
        }
    }
}

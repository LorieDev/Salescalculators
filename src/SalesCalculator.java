import java.util.Scanner;

public class SalesCalculator{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your product name: ");
        String product = scanner.nextLine();

        System.out.println("Please the price per unit: ");
        double price = scanner.nextDouble();

        System.out.println("Please enter the quantity sold: ");
        int quantity = scanner.nextInt();

        double total =  price * quantity;

        System.out.println("Product: " + product);
        System.out.println("Total Sales: $" + total);




        scanner.close();

    }
}
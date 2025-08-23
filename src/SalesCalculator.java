
import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String product = scanner.nextLine();

        System.out.print("Enter price per unit: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity sold: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.println("Product: " + product);
        System.out.println("Total Sales: $" + total);
    }
}

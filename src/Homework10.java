import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price = 999.99;
        int quantity;

        System.out.print("Plese select the item: ");
        item = scanner.nextLine();
        System.out.printf("You chose %s, please chose the quantity: ", item);
        quantity = scanner.nextInt();
        double total = 999.99 * quantity;
        System.out.printf("You chose %d, %s the price will be %.2f", quantity, item, total);


        scanner.close();
    }
}

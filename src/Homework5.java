import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy: ");
        String item = scanner.nextLine();

        System.out.print("What is the price of the item: ");
        double price = scanner.nextDouble();

        System.out.print("Please chose the quantity: ");
        int quantity = scanner.nextInt();

        double total = quantity*price;

        if(quantity <= 0){
            System.out.println("Please select a valid number");
        } else{
            System.out.println("You have bought " + quantity + " " + item + " the price will be: " + total + "$");
        }
        scanner.close();
    }
}

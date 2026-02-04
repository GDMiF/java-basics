import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount;
        double newAmount;

        System.out.println("Enter the amount in USD: ");
        System.out.println("Choose currency to convert");
        System.out.println("1: Euro");
        System.out.println("2: Gel");
        System.out.println("3: Ruble");

        System.out.print("Chose an option: ");
        int option;
        option = scanner.nextInt();

        if(option == 1){
            System.out.print("Enter the amount: ");
            amount = scanner.nextDouble();
            newAmount = amount * 0.85;
            System.out.printf("Your new amount in Euro is : %,.2f", newAmount);
        } else if(option == 2){
            System.out.print("Enter the amount: ");
            amount = scanner.nextDouble();
            newAmount = amount * 2.7;
            System.out.printf("Your new amount in Gel is : %,.2f", newAmount);
        } else if(option == 3){
            System.out.print("Enter the amount: ");
            amount = scanner.nextDouble();
            newAmount = amount * 77.25;
            System.out.printf("Your new amount in Ruble is : %,.2f", newAmount);
        } else {
            System.out.println("Please enter the vbalid option");
        }

        scanner.close();
    }
}

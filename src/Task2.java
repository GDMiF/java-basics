import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000;
        double balance2;
        double newBalance;

        System.out.println("Welcome to your bank account");
        System.out.println("1: Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw ");
        System.out.print("Please chose the option: ");

        int option;
        option = scanner.nextInt();

        if(option == 1){
            System.out.printf("Your balance is %,.2f", balance);
        } else if(option ==2){
            System.out.print("Enter the amount you want to deposit: ");
            balance2 = scanner.nextDouble();
            if(balance2 < 0){
                System.out.println("Deposite amount cant be negative");
            } else {
                newBalance = balance + balance2;
                System.out.printf("Your new balance is: %,.2f", newBalance);
            }
        } else if(option == 3){
            System.out.print("Enter the amount you want to withdraw: ");
            balance2 = scanner.nextDouble();
            if(balance2>balance){
                System.out.println("You don't have that amount of money on your bank account");
            } else{
                newBalance = balance - balance2;
                System.out.printf("Your new balance is: %,.2f", newBalance);
            }
        } else{
            System.out.println("Please enter the valid option");
        }

        scanner.close();
    }
}

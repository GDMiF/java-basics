import java.util.Scanner;

public class main29 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposite();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("****************");
        System.out.println("Thank You have a nice day ♡");
        System.out.println("****************");

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("****************");
        System.out.printf("$%,.2f\n", balance);
    }

    static double deposite(){
        double amount;
        System.out.print("Enter an amount to be deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount cant be negative");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance){

        double amount;
        System.out.print("Enter an amount to be Withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Invalid Operation");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount cant be Negative");
            return 0;
        }
        else {
            return amount;
        }
    }

}

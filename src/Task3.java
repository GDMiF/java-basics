import java.util.Scanner;


public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            System.out.println("****************");
            System.out.println("WELCOME TO BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("Chose the option");
            System.out.println("1: Show Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.print("Type here: ");

            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += showDeposit();
                case 3 -> balance -= showWithdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Please Enter something from 1-4: ");
            }
        }

        System.out.println("****************");
        System.out.println("You Exit the program");
        System.out.println("****************");

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("****************");
        System.out.printf("Your balance is %,.2f \n", balance);
    }

    static double showDeposit(){
       double amount;
       System.out.print("Enter an amount: ");
       amount = scanner.nextDouble();

       if(amount <= 0){
           System.out.println("Amount cant be negative");
           return 0;
       } else{
           return amount;
       }
    }

    static double showWithdraw(double balance){
        double amount;
        System.out.print("Enter an amount: ");
        amount = scanner.nextDouble();

        if(amount <= 0){
            System.out.println("Amount cant be negative or 0 ");
            return 0;
        } else if(amount > balance){
            System.out.println("Withdraw amount cant be more then balance");
            return 0;
        } else{
            return amount;
        }
    }

}

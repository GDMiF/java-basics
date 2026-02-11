import java.util.Random;
import java.util.Scanner;

public class MiniCasino {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();

        String choseOption;
        double balance = 1000;
        boolean isRunning = true;
        double newBalance;

        System.out.println("**********************");
        System.out.println("Welcome To Casino 🍒💸");
        System.out.println("**********************");

        do {

        System.out.printf("Your balance is %,.2f S\n", balance);
        System.out.println("Chose option");
        System.out.println("Press 1: for Play game 🎰");
        System.out.println("Press 2: for Deposit 💳");
        System.out.println("Press 3: for Withdraw 💰");
        System.out.print("Type here: ");
        choseOption = scanner.nextLine().toUpperCase();


           switch (choseOption) {
               case "1" -> {
                   System.out.println("**********************************");
                   System.out.println("Chose Which game you want to play: ");
                   System.out.println("**********************************");
                   System.out.println("Press S for Slots");
                   System.out.println("Press N for Number Guessing game");
                   System.out.println("Press D for Dice Game");
                   System.out.print("Type here: ");
                   choseOption = scanner.nextLine().toUpperCase();
               }



               case "2" -> {
                   balance += depositBalance();
               }



               case "3" -> System.out.println("Withdraw");
               default -> {

               }

           }
       } while(isRunning);


        scanner.close();
    }

    static double depositBalance(){
        double amount;
        do{
            System.out.print("Please enter how much money you want to deposit: ");
            amount = scanner.nextDouble();

            if(amount <= 0){
                System.out.println("Amount cant be negative or 0. Try again!");
            }
        }
        while(amount <= 0);
        return amount;
    }



}
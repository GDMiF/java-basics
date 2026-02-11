import java.util.Random;
import java.util.Scanner;

public class MiniDiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        String playAgain;

        System.out.println("*************************");
        System.out.println("Welcome to the Dice Arena");
        System.out.println("*************************");


        while (balance > 0) {
            System.out.println("Your current balance is: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();


            if (bet <= 0) {
                System.out.println("Amount cant be negative or 0");
                continue;
            } else if (bet > balance) {
                System.out.println("Amount cant be less then balance");
                continue;
            } else {
                balance -= bet;

                System.out.println("Your roll is: ");
                int[] yourRoll = rollDice();
                printDice(yourRoll);
                int yourSum = diceSum(yourRoll);

                System.out.println("Enemy roll is: ");
                int[] enemyRoll = rollDice();
                printDice(enemyRoll);
                int enemySum = diceSum(enemyRoll);

                if (yourSum > enemySum) {
                    System.out.println("You won");
                    balance += bet * 2;
                } else if (yourSum < enemySum) {
                    System.out.println("You Lose");
                } else {
                    System.out.println("Tie Try again )");
                    balance += bet;
                }
            }

            System.out.print("Do you want to play again (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                System.out.println("GAME OVER!!! THANKS FOR PLAYING");
                break;
            }
        }

    }

    static int[] rollDice(){
        Random random = new Random();
        int[] roll = new int[3];

        for(int i = 0; i < roll.length; i++){
            roll[i] = random.nextInt(1,7);
        }
        return roll;
    }

    static void printDice(int [] roll){
        for(int i = 0; i < roll.length; i++){
            System.out.print(roll[i] + " \n");
        }
    }

   static int diceSum(int [] roll){
        int sum = 0;
        for(int i = 0; i < roll.length; i++){
            sum += roll[i];
        }
        return sum;
   }



}

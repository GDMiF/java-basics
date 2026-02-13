import java.util.Random;
import java.util.Scanner;

public class MiniCasino {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();

        String choseOption;
        double balance = 1000;
        boolean isRunning = true;
        boolean isPlaying = true;
        double newBalance;
        double bet;
        double coefficient;
        int numberAttemps;
        boolean gameOn = true;

        System.out.println("**********************");
        System.out.println("Welcome To Casino 🍒💸");
        System.out.println("**********************");

        do {

            System.out.printf("Your balance is %,.2f S\n", balance);
            System.out.println("Chose option");
            System.out.println("Press 1: for Play game 🎰");
            System.out.println("Press 2: for Deposit 💳");
            System.out.println("Press 3: for Withdraw 💰");
            System.out.println("Press 4: for Exit ❌");
            System.out.print("Type here: ");
            choseOption = scanner.nextLine();

            switch (choseOption) {
                case "1" -> {
                    System.out.println("**********************************");
                    System.out.println("Chose Which game you want to play: ");
                    System.out.println("**********************************");
                    System.out.println("Press S for Slots🎰");
                    System.out.println("Press N for Number Guessing game🎱");
                    System.out.println("Press D for Dice Game🎲");
                    System.out.println("Press E for Return to menu👈");
                    System.out.print("Type here: ");
                    choseOption = scanner.nextLine().toUpperCase();


                    switch (choseOption) {
                        case "S" -> System.out.println("Slots");
                        case "N" -> {
                            do {
                                System.out.println("Welcome to Number Guessing game🎱");
                                System.out.println("Current balance: " + balance);

                                System.out.println("1: 7 attempts - x1.5");
                                System.out.println("2: 5 attempts - x2");
                                System.out.println("3: 3 attempts - x2.5");
                                System.out.print("Chose numbers of attempt: ");
                                choseOption = scanner.nextLine();

                                switch (choseOption) {
                                    case "1" -> {
                                        numberAttemps = 7;
                                        coefficient = 1.5;
                                        balance = playNumberaGuessing(numberAttemps, balance, coefficient);
                                        scanner.nextLine();
                                    }
                                    case "2" -> {
                                        numberAttemps = 5;
                                        coefficient = 2;
                                        balance = playNumberaGuessing(numberAttemps, balance, coefficient);
                                        scanner.nextLine();
                                    }
                                    case "3" -> {
                                        numberAttemps = 3;
                                        coefficient = 2.5;
                                        balance = playNumberaGuessing(numberAttemps, balance, coefficient);
                                        scanner.nextLine();
                                    }
                                }
                            gameOn = playGameAgain();
                            } while(gameOn);
                        }
                        case "D" -> {
                            System.out.println("Welcome to the Dice Game🎲");
                            System.out.println("Current balance: " + balance);
                            System.out.println("Your rolling 2 dice: Guess the Number:");
                            System.out.println("1) Big 8 - 12 - x2");
                            System.out.println("2) Small 2 - 6 - x2");
                            System.out.println("3) Exact number - x5");
                            System.out.print("Chose your option");
                            choseOption = scanner.nextLine();

                            switch(choseOption){
                                case "1" -> {
                                    for(int i = 0; i < 2; i++){
                                        playDiceGame();
                                    }
                                }
                                case "2" -> System.out.println("2");
                                case "3" -> System.out.println("3");
                            }









                        }
                        default -> System.out.println("Chose the valid option!");
                    }
                }


                case "2" -> {
                    balance += depositBalance();
                    scanner.nextLine();
                }
                case "3" -> {
                    balance -= withdrawBalance(balance);
                    scanner.nextLine();
                }
                case "4" -> {
                    isRunning = false;
                }
                default -> {
                    System.out.println("Chose the valid option!");
                }
            }
        } while (isRunning);

        System.out.println("Thanks for visiting our Casino 💞");

        scanner.close();
    }

    static double depositBalance() {
        double amount;
        do {
            System.out.print("Please enter how much money you want to deposit: ");
            amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Amount cant be negative or 0. Try again!");
            }
        }
        while (amount <= 0);
        return amount;
    }

    static double withdrawBalance(double balance) {
        double amount;

        do {
            System.out.print("Please enter how much money you want to withdraw: ");
            amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Amount cant be negative or 0. Try again!");
            } else if (amount > balance) {
                System.out.println("Invalid operation: Withdraw balance cant be more then your balance");
            }
        }
        while (amount <= 0 || amount > balance);
        return amount;
    }

    static double betMoney(double balance) {

        double bet;

        do {
            System.out.print("Place your bet amount: ");
            bet = scanner.nextDouble();

            if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
            } else if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
            }
        }
        while (bet <= 0 || bet > balance);
        return bet;
    }

    static double playNumberaGuessing(int numberAttempts, double balance, double coefficient) {

        Random random = new Random();

        String numberChose;
        boolean gameOn = true;
        int myGuess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 101);

        double bet = betMoney(balance);
        double winAmount = bet * coefficient;


        while (gameOn) {
            System.out.print("Guess the Number Between 1-100: ");
            myGuess = scanner.nextInt();
            attempts++;

            if (myGuess == randomNumber) {
                System.out.println("Congratulations You Won!");
                System.out.println("The number of attempts were: " + attempts);
                System.out.printf("You won %,.2f$\n", winAmount);
                balance += bet * coefficient;
                System.out.printf("Your balance is %,.2f$\n", balance);
                gameOn = false;
            } else {
                if (myGuess < 0 || myGuess > 100) {
                    System.out.println("The number should be between 0 and 100. Try again! attempts: " + attempts);
                } else if (myGuess > randomNumber) {
                    System.out.println("Too High! attempts: " + attempts);
                } else if (myGuess < randomNumber) {
                    System.out.println("Too Low! attempts: " + attempts);
                }
                if (attempts >= numberAttempts) {
                    System.out.println("You Lose");
                    balance -= bet;
                    gameOn = false;
                }
            }
        }
        return balance;
    }

    static boolean playGameAgain() {
        System.out.print("Press Y to play again| Press Any key to quit: ");
        String answer = scanner.nextLine().toUpperCase();
        return answer.equals("Y");
    }

    static double playDiceGame(){

        Random random = new Random();

        int roll = random.nextInt(1,7);

        System.out.println("Your rolled " + roll);

        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
            """;
        String dice2 = """
                -------
               | ●     |
               |       |
               |      ●|
                -------
            """;
        String dice3 = """
                -------
               | ●     |
               |   ●   |
               |      ●|
                -------
            """;
        String dice4 = """
                -------
               | ●   ● |
               |       |
               | ●   ● |
                -------
            """;
        String dice5 = """
                -------
               | ●   ● |
               |   ●   |
               | ●   ● |
                -------
            """;
        String dice6 = """
                -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
                -------
            """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Incalid roll");
        }
        return roll;
    }

}
import java.util.Random;
import java.util.Scanner;

public class MiniCasino {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String choseOption;
        double balance = 1000;
        boolean isRunning = true;
        double coefficient;
        int numberAttemps;
        boolean gameOn = true;
        int playerChose = 0;
        String [] row;

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
                        case "S" -> {
                            System.out.println("**************************");
                            System.out.println("Welcome to the Slot Game🎰");
                            System.out.println("**************************");
                            System.out.println("Current balance: " + balance);
                            System.out.println("Symbols: 🍓 🍒 🍉 🍋 🍀");
                            System.out.println("Spinning...");
                            spinRow(balance);
                            row = spinRow(balance);
                            printRow(row);
                        }
                        case "N" -> {
                            do {
                                System.out.println("*********************************");
                                System.out.println("Welcome to Number Guessing game🎱");
                                System.out.println("*********************************");
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
                           do {
                               System.out.println("**************************");
                               System.out.println("Welcome to the Dice Game🎲");
                               System.out.println("**************************");
                               System.out.println("Current balance: " + balance);
                               System.out.println("Your rolling 2 dice: Guess the Number:");
                               System.out.println("1) Big 8 - 12 - x2");
                               System.out.println("2) Small 2 - 6 - x2");
                               System.out.println("3) Exact number - x5");
                               System.out.print("Chose your option: ");
                               choseOption = scanner.nextLine();

                               switch (choseOption) {
                                   case "1" -> {
                                       playerChose = 1;
                                       balance = diceResult(playerChose, balance);
                                       scanner.nextLine();

                                   }
                                   case "2" -> {
                                       playerChose = 2;
                                       balance = diceResult(playerChose, balance);
                                       scanner.nextLine();

                                   }
                                   case "3" -> {
                                       playerChose = 3;
                                       balance = diceResult(playerChose, balance);
                                       scanner.nextLine();
                                   }
                               }
                               gameOn = playGameAgain();
                           }while(gameOn);
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
                case "4" -> isRunning = false;
                default -> System.out.println("Chose the valid option!");
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
                    System.out.printf("Your balance is %,.2f$\n", balance);
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

    static void playDiceGame(int roll){
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
            default -> System.out.println("Invalid roll");
        }
    }

    static double diceResult(int playerChose, double balance) {

        Random random = new Random();
        boolean gameOn = true;
        double bet = betMoney(balance);
        int total = 0;
        int playerGuess = 0;

    while(gameOn) {

        if (playerChose == 3) {
            System.out.print("Guess exact number (2 - 12): ");
            playerGuess = scanner.nextInt();

            if (playerGuess < 2 || playerGuess > 12) {
                System.out.println("Invalid number! You lose.");
                return balance - bet;
            }
        }


        for (int i = 0; i < 2; i++) {
            int roll = random.nextInt(1, 7);
            playDiceGame(roll);
            System.out.println("You rolled: " + roll);
            total += roll;
        }
        System.out.println("Total: " + total);


        if (playerChose == 1 && total >= 8) {
            System.out.println("You Won!");
            balance += bet * 2;
            System.out.printf("Your balance is %,.2f$\n", balance);
            gameOn = false;
        } else if (playerChose == 2 && total <= 6) {
            System.out.println("You Won!");
            balance += bet * 2;
            System.out.printf("Your balance is %,.2f$\n", balance);
            gameOn = false;
        } else if (playerChose == 3 && total == playerGuess) {
            System.out.println("You Won!");
            balance += bet * 5;
            System.out.printf("Your balance is %,.2f$\n", balance);

            gameOn = false;
        } else {
            System.out.println("You Lose!");
            balance -= bet;
            System.out.printf("Your balance is %,.2f$\n", balance);
            gameOn = false;
        }

    }
        return balance;
    }





    static String[] spinRow(double balance){

        String [] symbols = {"🍓", "🍒", "🍉", "🍋", "🍀"};
        String [] row = new String[3];
        String result;
        double bet = betMoney(balance);
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        if(row[0].equals(row[1]) && row[1].equals(row[2]) ){
            System.out.println("You Won");
            balance += bet*2;

        } else {
            System.out.println("You Lose");
            balance -= bet;
        }


        return row;
    }

    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }


}
import java.util.Random;
import java.util.Scanner;

public class main37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(0,3)];
            System.out.println("Computer choise: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie");
            }else if(playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissores") && computerChoice.equals("paper")){
                System.out.println("You Win");
            }else{
                System.out.println("You Lose");
            }
            System.out.println("Play Again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing");



        scanner.close();
    }
}

import java.util.Scanner;

public class main36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"What is the first Eminem album?",
                "When was Recovery released?",
                "In which album is the song Rap god?",
                "How many grammys does Eminem have?",
                "What was the name of unreleased album in 2007?",};

        String[][] options = {{"1: SSLP", "2: Relapse", "3: Infinite", "4: Music to be murder by"},
                {"1: 2010", "2: 2002", "3: 2014", "4: 2009"},
                {"1: MMLP", "2: Infinite", "3: Recovery", "4: MMLP 2"},
                {"1: 22", "2: 5", "3: 12", "4: 15"},
                {"1: Relapse", "2; SSLP2", "3: Curtains Down", "4: King Matthers"}};

        int[] answers = {3, 1, 4, 4, 4};
        int score = 0;
        int guess;

        System.out.println("********************************");
        System.out.println("Welcome to the Java Quiz game :)");
        System.out.println("********************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("****************");
                System.out.println("CORRECT");
                System.out.println("****************");
                score++;
            } else {
                System.out.println("********");
                System.out.println("WRONG");
                System.out.println("********");
            }
        }
        System.out.println("Your final score is: " + score + " out of " + questions.length);



        scanner.close();
    }
}

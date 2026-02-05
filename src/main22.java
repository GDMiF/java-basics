import java.util.Random;
import java.util.Scanner;

public class main22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);
        int attempt = 0;

        System.out.printf("Try to guess number between %d-%d: ", min, max);
        number = scanner.nextInt();

        do{
            if(number > randomNumber){
                System.out.print("Too high ");
            } else if (number < randomNumber){
                System.out.print("Too low ");
            }
            System.out.print("pls try again: ");
            number = scanner.nextInt();
            attempt ++;
        } while (number != randomNumber);

        System.out.println("Correct the number was " + randomNumber);
        System.out.println("The number of attempts were " + attempt);



        scanner.close();
    }
}

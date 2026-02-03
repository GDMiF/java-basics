import java.util.Scanner;
import java.util.Random;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number1;
        int number2;

        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1,7);

        System.out.println(number1);
        System.out.println(number2);

        if(number1 + number2 == 7){
            System.out.println("Lukcy");
        } else if (number1 + number2 == 2 || number1 + number2 == 12){
            System.out.println("Unlucky");
        } else {
            System.out.println("Try again");
        }

        int attempt;
        int heads = 0;
        int tails = 0;
        boolean isResult;

        System.out.print("How many times to flit the coin? ");
        attempt = scanner.nextInt();

        isResult = random.nextBoolean();

        if(isResult){
            heads ++;
        } else {
            tails++;
        }

        System.out.println(tails);
        System.out.println(heads);



        scanner.close();
    }
}

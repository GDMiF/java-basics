import java.util.Scanner;
import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        boolean isHeads;


        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Heads");
        } else{
            System.out.println("Tails");

        }
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        scanner.close();
    }
}

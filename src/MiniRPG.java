import java.util.Scanner;
import java.util.Random;

public class MiniRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the player nickname: ");
        String name = scanner.nextLine();

        int hp = 100;
        System.out.println("Your name is " + name + " you have " + hp + "hp");

        do{
            int damage1 = random.nextInt(10, 26);
            hp -= damage1;
            if(hp <= 0){
                hp = 0;
            }
            System.out.println("You got attacked and hit for " + damage1 + " now you have " + hp + " hp");
        } while(hp > 0);

        System.out.println("you died");

        scanner.close();
    }
}

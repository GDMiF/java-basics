import java.util.Scanner;
import java.util.Random;

public class MiniRPG2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char startButton;
        String name;
        int hp = 100;

        int attack;
        int defence;
        int heal;
        int enemyHp = 100;

        char actionButton;

        System.out.print("Enter the player name: ");
        name = scanner.nextLine();
        System.out.println("Welcome " + name + " you have " + hp + " hp");


        do{
            System.out.print("Please press the F to start the Fight: ");
            startButton = Character.toUpperCase(scanner.next().charAt(0));
        }while ((!(startButton == 'F')));

        System.out.println("Your Enemy is Morgott the Omen King ->" + enemyHp + "hp" );
        System.out.println("Chose your next move: ");
        System.out.println("Press A to Attack: ⚔\uFE0F");
        System.out.println("Press H to Heal: ❤\uFE0F ");

        do{
            attack = random.nextInt(10,26);
            defence = random.nextInt(10,26);
            heal =random.nextInt(0,40);

            actionButton = Character.toUpperCase(scanner.next().charAt(0));
            if(actionButton == 'H'){
                hp = hp + heal;
                System.out.println("You heal " + heal + " hp now u are " + hp + " hp");
                hp = hp - defence;
                if(hp<0){
                    hp = 0;
                }
                System.out.println("Margott hit u with " + defence + " damage, now u are " + hp + " hp");
            }if(actionButton == 'A'){
                enemyHp = enemyHp - attack;
                if(enemyHp<0){
                    enemyHp = 0;
                }
                System.out.println("You deal " + attack + " damage, now Margott is " + enemyHp + " hp");
                hp = hp - defence;
                if(hp<0){
                    hp = 0;
                }
                System.out.println("Margott hit u with " + defence + " damage, now you are " + hp + " hp");
            }
        } while(hp > 0 && enemyHp > 0);

        if(hp == 0){
            System.out.println("You died Morgott wins!");
        } else if(enemyHp == 0){
            System.out.println("VICTRY");
        } else{
            System.out.println("Tie");
        }

        scanner.close();
    }
}


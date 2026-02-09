import java.util.Random;
import java.util.Scanner;

public class MiniRPG3 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String name;
        int hp = 100;
        int enemyHp = 100;
        int enemy = random.nextInt(1,5);
        int element;
        char option = ' ';
        String enemy1 = "Rennala, Queen of the Full Moon";
        String enemy2 = "Godrick the Grafted";
        String enemy3 = "Fire Giant";
        String enemy4 = "Maliketh, the Black Blade";


        System.out.print("Enter Your nickname: ");
        name = scanner.nextLine();
        System.out.printf("Hello %s, chose your element: 1) Water, 2) Earth, 3) Fire, 4) Air\n", name);
        System.out.print("Chose: ");
        element = scanner.nextInt();
        while(element < 1 || element > 4){
            System.out.print("Please type number 1-4 to choose element: ");
            element = scanner.nextInt();
        }
        switch (element) {
            case 1 -> System.out.printf("%s, you chose Water you are 100 Hp\n", name);
            case 2 -> System.out.printf("%s, you chose Earth you are 100 Hp\n", name);
            case 3 -> System.out.printf("%s, you chose Fire you are 100 Hp\n", name);
            case 4 -> System.out.printf("%s, you chose Air you are 100 Hp\n", name);
        }
        switch (enemy) {
            case 1 -> System.out.printf("Your enemy is %s, her element is Water. She is 100 hp\n" , enemy1);
            case 2 -> System.out.printf("Your enemy is %s, his element is Earth. He is 100 hp\n", enemy2);
            case 3 -> System.out.printf("Your enemy is %s, his element is Fire. He is 100 hp\n", enemy3);
            case 4 -> System.out.printf("Your enemy is %s, the Black Blade his element is Air. He is 100 hp\n", enemy4);
        }

        System.out.println("Press button to chose your next move: A - Attack⚔\uFE0F, M - Magic Attack\uD83E\uDDD9\uD83C\uDFFB, H- Heal❤\uFE0F, E - Run\uD83C\uDFC3");
        {


            do{
            switch (playerMove(' ')) {
                    case 'A' -> {
                        int playerDamage = playerAttack();
                        int enemyDamage =enemyAttack();
                        enemyHp -= playerDamage;
                        if(enemyHp<0){
                            enemyHp = 0;
                        }
                        System.out.printf("You use attacks, Deal %d damage. Enemy Hp - %d\n",playerDamage, enemyHp);
                        hp -= enemyDamage;
                        if(hp<0){
                            hp = 0;
                        }
                        System.out.printf("Enemy attacks you. Deal %d damage Your Hp - %d\n",enemyDamage, hp);
                    }

                    case 'M' -> {
                        System.out.println("Magic Attack");
                    }


                    case 'H' -> {
                        int playerHp = playerHealth();
                        int enemyDamage =enemyAttack();
                        hp += playerHp;
                        System.out.printf("You use Heal. You heal %d Hp. Your Hp - %d\n", playerHp, hp);
                        hp -= enemyDamage;
                        if(hp<0){
                            hp = 0;
                        }
                        System.out.printf("Enemy attacks you. Deal %d damage Your Hp - %d\n",enemyDamage, hp);

                    }
                    case 'E' -> {
                        System.out.println("You escaped the combat, Try again :)");
                        System.out.println("Press button to chose your next move: A - Attack⚔\uFE0F, M - Magic Attack\uD83E\uDDD9\uD83C\uDFFB, H- Heal❤\uFE0F, E - Exit\uD83C\uDFC3");
                        hp = 100;
                        enemyHp = 100;

                    }
                }
        } while (hp > 0 && enemyHp > 0);

            if(hp == 0 && enemyHp == 0){
                System.out.println("Tie: Try again!");
            }
            else if(hp == 0){
                System.out.println("You Lose!!!");
            } else if (enemyHp == 0){
                System.out.println("You Win!");
            }
        }



        scanner.close();
    }

        static char playerMove(char option){
            while (option != 'A' && option != 'M' && option != 'H' && option != 'E') {
                System.out.print("Press the button: ");
                option = Character.toUpperCase(scanner.next().charAt(0));
            }
            return option;
        }

        static int playerAttack(){
            int attack = random.nextInt(10, 26);
            return attack;
        }
        static int enemyAttack(){
            int attack2 = random.nextInt(10, 26);
            return attack2;
        }
        static int playerHealth(){
            int health = random.nextInt(5,35);
            return health;
        }

}

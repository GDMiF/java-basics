import java.util.Random;
import java.util.Scanner;

public class MiniArena {
    public static void main(String[] args) {
         Random random = new Random();
         Scanner scanner = new Scanner(System.in);

         double baseDamage = 10;
         double finalDamage;
         boolean isRunnng = true;
         String [] elements = {"fire", "water", "nature", "air", "lightning", "earth"};


        double [][] damageTable = {{1, 0.3, 3, 1, 1, 1},
                {3, 1, 0.3, 1, 1, 1},
                {0.3, 3, 1, 1, 1, 1},
                {1, 1, 1, 1, 3, 0.3},
                {1, 1, 1, 0.3, 1, 3},
                {1, 1, 1, 3, 0.3, 1}
        };

        for(int round  = 1; round <= 5; round  ++ ){
            int playerIndex = random.nextInt(elements.length);
            int enemyIndex = random.nextInt(elements.length);

            String playerElement = elements[playerIndex];
            String enemyElement = elements[enemyIndex];

            System.out.println("round: " + round);
            arenaRound(baseDamage, damageTable, playerElement, enemyElement, playerIndex, enemyIndex);
        }



        scanner.close();
    }

    static double arenaRound(double baseDamage, double[][] damageTable, String playerElement, String enemyElement, int playerIndex, int enemyIndex){
        double finalDamage;
        double finalEnemyDamage;
        int win = 0;
        int lose = 0;
        int tie = 0;
        finalDamage = baseDamage * damageTable[playerIndex][enemyIndex];
        finalEnemyDamage = baseDamage * damageTable[enemyIndex][playerIndex];
        System.out.println("player element is: " + playerElement);
        System.out.println("Enemy element is: " + enemyElement);
        System.out.println("The damage is: " + finalDamage);
        System.out.println("The enemy damage is: " + finalEnemyDamage);

        if(finalDamage > finalEnemyDamage){
            System.out.println("You Won the round");
            win ++;
        } else if(finalDamage < finalEnemyDamage){
            System.out.println("You Lose the roind");
            lose ++;
        } else{
            System.out.println("Tie");
            tie ++;
        }

        return finalDamage;
    }
}

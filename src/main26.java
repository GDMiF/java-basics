import java.util.Scanner;

public class main26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Miko";
        int age = 22;

        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);

        double result = squareNumber(3);
        System.out.println(result);

        double result2 = cubeNumber(5);
        System.out.println(result2);

        String fullName = getFullName("Miko", "Berulava");
        System.out.println(fullName);

        int age2 = 22;

        if (ageCheck(age2)){
            System.out.println("You may sign up");
        } else {
            System.out.println("You must be 18+ to sing up");
        }



        scanner.close();
    }

    static void happyBirthday(String racminda, int isevRacMinda){
        System.out.println("happy Birthday to you!");
        System.out.printf("happy Birthday dead %s!\n", racminda);
        System.out.printf("You are %d years old!\n", isevRacMinda);
        System.out.println("Happy Birthday to you!\n");
    }

    static double squareNumber(double number){
        return number*number;
    };

    static double cubeNumber(double number){
        return number * number * number;
    }

    static String getFullName(String first, String Second){
        return first + " " + Second;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        } else {
            return false;
        }
    }
}

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        double numbers = 1.5;
        char character = '$';
        boolean isStudent = true;
        String name = "Miko Berulava";

        System.out.print("Please type your full name here: ");
        name=scanner.nextLine();
        System.out.println("Your full name is " + name);

        System.out.print("What you would like to eat? ");
        name=scanner.nextLine();
        System.out.print("What is the price of the food? ");
        numbers=scanner.nextDouble();
        System.out.print("What is the quantity? ");
        number=scanner.nextInt();

        double total = numbers * number;

        if(number<=0){
            System.out.println("Invalid Number");
        } else {
            System.out.println("So you are buying " + number + " " + name + " each for " + numbers + character + " the total price will be: " + total + character );
        }

        scanner.close();
    }
}

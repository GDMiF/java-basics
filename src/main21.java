import java.util.Scanner;

public class main21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        int age = 0;

        do{
            System.out.println("Your age cant be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while (age < 0);

        System.out.println("You are " + age + " years old");


        int number = 0;

        do{
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();
    }
}

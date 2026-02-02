import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("You name is " + name);

        System.out.print("Enter you age ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");

        System.out.print("Enter the full price ");
        double price = scanner.nextDouble();
        System.out.println("The full price is: " + price);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent){
            System.out.println("You are a student");
        }else {
            System.out.println("You are not a student");
        }

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The are is: " +area +"cm");


        scanner.close();
    }
}

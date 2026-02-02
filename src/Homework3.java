import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int age = 0;
//
//        System.out.print("Enter you age pls: ");
//        age = scanner.nextInt();
//
//        if(age >= 18){
//            System.out.println("You can drink Vodka");
//        }else if(age <= 0){
//            System.out.println("Invalid age");
//        }
//        else {
//            System.out.println("You cant drink yet");
//        }

        double number1 = 0;
        double number2 = 0;

        System.out.print("Please enter the first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Please enter the option: ");
        String option = scanner.next();

        System.out.print("Plaese enter the second number: ");
        number2 = scanner.nextDouble();

        if(option.equals("+")){
            System.out.println(number1 + number2);
        }else if(option.equals("-")){
            System.out.println(number1 - number2);
        }else if(option.equals("/")){
            if(number2 != 0){
                System.out.println(number1 / number2);
            } else {
                System.out.println("Cannot divide by zero!");
            }
        }else if(option.equals("*")){
            System.out.println(number1 * number2);
        }else{
            System.out.println("Invalid Operation");
        }

        scanner.close();

    }
}

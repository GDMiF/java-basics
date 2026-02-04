import java.util.Scanner;

public class Homework19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        char operation;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Choose the first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Choose the operation: (+, -, *, /, ^): ");
        operation = scanner.next().charAt(0);

        System.out.print("Choose the second number: ");
        number2 = scanner.nextDouble();

        switch(operation){
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if(number2 == 0){
                    System.out.println("It cannot be divided by 0");
                    validOperation = false;
                } else{
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default -> {
                System.out.println("Invalid operation");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.printf("%.2f", result);
        } else{
            System.out.println("Please write everything correct");
        }

        scanner.close();
    }
}

import java.util.Scanner;


public class main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You are a senior you get 20% discount");
                System.out.println("You are a student you get 10% discount");
                price *= 0.7;
            } else{
                System.out.println("You are a student you get 10% discount");
                price *= 0.9;
            }
        } else {
            if(isSenior){
                System.out.println("You are a senior you get 20% discount");
                price *= 0.8;
            } else {
                System.out.println("You have no discount");
            }
        }

        System.out.printf("The price of a ticket is: %.2f$", price);

        scanner.close();
    }
}

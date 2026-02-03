import java.util.Scanner;


public class Homework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cash;
        System.out.print("Plese enter the amount in USD: ");
        cash = scanner.nextDouble();

        double gel = cash * 2.69;

        System.out.printf("Your amount in %,.2f gel \n", gel);


        System.out.print("Plese enter the number of subjects: ");
        double subject = scanner.nextDouble();

        double grade1 = 9;
        double grade2 = 7.8;
        double grade3 = 8.2;
        double grade4 = 9.3;
        double grade5 = 9.7;

        double totalGrade = (grade1 + grade2 + grade3 +grade4 + grade5) / subject;
        System.out.printf("your avr grade is %.1f", totalGrade);


        scanner.close();
    }
}

import java.util.Scanner;

public class main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String day;
        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        switch(day){
            case "Monday", "Thuesday", "Wednesday",
                 "Thursday", "Friday" -> System.out.println("it is a week day");
            case "Saturday", "Sunday" -> System.out.println("it is a weekend");
            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }
}

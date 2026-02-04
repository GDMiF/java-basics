import java.util.Scanner;


public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int house = 1;

        String timeOfDay = (house < 12) ? "AM" : "PM";

        System.out.println(timeOfDay);

        scanner.close();
    }
}

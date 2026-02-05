import java.util.Scanner;

public class main23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i < max; i++){
            System.out.println("Miko");
        }

        int start =10;

        for(int i = start; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Happy new year");

        scanner.close();
    }
}

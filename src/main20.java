import java.util.Scanner;

public class main20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        && = AND;
//        || = OR;
//        ! = NOT;

        double temp = 35;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good");
            System.out.println("It is sunny outshide");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is good");
            System.out.println("It is cloudy outshide");
        } else if(temp >30 || temp <0){
            System.out.println("The weather is bad");
        }

        String usernam;
        System.out.print("Enter your new username: ");
        usernam = scanner.nextLine();

        if(usernam.length() <4 || usernam.length() >12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(usernam.contains(" ")|| usernam.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else {
            System.out.println("Welcome " + usernam);
        }

        scanner.close();
    }
}

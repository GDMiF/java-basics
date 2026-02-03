import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String gmail;
        String username;
        String domain;
        System.out.print("Enter your gmail: ");

        gmail = scanner.nextLine();

        if(gmail.contains("@")){
            username = gmail.substring(0, gmail.indexOf("@"));
            domain = gmail.substring(gmail.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Invalid gmail");
        }


//        String email = "MikoBerulava@gmail.com";
//        String username = email.substring(0,email.indexOf("@"));
//        String domain = email.substring(email.indexOf("@") +1);
//
//        System.out.println(username);
//        System.out.println(domain);

        scanner.close();

    }
}

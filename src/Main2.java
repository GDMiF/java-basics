public class Main2 {
    public static void main(String[] args){
        int age = 23;
        int year = 2026;
        int quantity = 1;

        double price = 1.99;
        double gpa = 1.19;
        double temperature = -2.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Miko Berulava";
        String food = "Burger";
        String anime = "Attack on titan";

        System.out.println("The year is " + year);
        System.out.println("The temperature is " + temperature);
        System.out.println("The American cash currency is " + currency);
        System.out.println(isOnline);
        System.out.println("My name is " + name);
        System.out.println("My name is " + name + " and my fav anime is " + anime);

        if(isOnline){
            System.out.println("Go play Ylol");
        }else {
            System.out.println("Go Watch " + anime);
        }
    }
}

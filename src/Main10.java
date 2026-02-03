public class Main10 {
    public static void main(String[] args) {

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmloyed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name start with %c\n", firstLetter);
        System.out.printf("You are %d years olf\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Emloyeed: %b\n", isEmloyed);

        System.out.printf("%s is %d years old\n", name, age);

        double price1 = 90.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.2f\n", price3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7809;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

    }
}

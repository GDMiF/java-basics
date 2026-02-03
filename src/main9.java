import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 3);
        System.out.println(result);

        result = Math.pow(2, 5);
        System.out.println(result);

        result = Math.abs(-5);
        System.out.println(result);

        result = Math.sqrt(9);
        System.out.println(result);

        result = Math.round(3.23);
        System.out.println(result);

        result = Math.ceil(3.14);
        System.out.println(result);

        result = Math.floor(3.99);
        System.out.println(result);

        result = Math.max(10, 30);
        System.out.println(result);

        result = Math.min(10, 30);
        System.out.println(result);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the lenght of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse (side c) is: " + c);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.2f cm\n", circumference);
        System.out.printf("The area is: %.2f cm2\n", area);
        System.out.printf("The volume is: %.2f cm3\n", volume);




        scanner.close();
    }
}

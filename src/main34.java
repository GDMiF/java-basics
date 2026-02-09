import java.util.Scanner;

public class main34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(add(1, 2, 3, 4, 5, 6));
    }

    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;

    }
}

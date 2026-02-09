import java.util.Arrays;

public class main31 {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orage", "banana", "coconut" };
        Arrays.sort(fruits);
        System.out.println(fruits[0]);
//        Arrays.fill(fruits, "pineapple");

//        fruits[0] = "pineapple";
//        int numofFruits = fruits.length;   (Answer will be 4)
//
//        System.out.println(fruits[0]);
//        System.out.println(numofFruits);
//
        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i]+ " \n");
        }

        for(String lalala: fruits){
            System.out.print(lalala + " ");
        }
    }
}

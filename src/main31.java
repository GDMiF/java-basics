import java.util.Arrays;

public class main31 {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orage", "banana"};
        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

//        fruits[0] = "pineapple";
//        int numofFruits = fruits.length;
//
//        System.out.println(fruits[0]);
//        System.out.println(numofFruits);
//
//        for(int i = 0; i < fruits.length; i++){
//            System.out.print(fruits[i] + " ");
//        }

        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}

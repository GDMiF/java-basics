import java.util.Scanner;

public class main33 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 2;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " +i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array");
        }

        String[] fruits = {"apple", "banana", "pinapple", "Peach"};
        System.out.print("Enter a food to search for: ");
        String fruit = scanner.nextLine();
        boolean isFruit = false;

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(fruit)){
                System.out.println("You found at inder: " + i);
                isFruit = true;
                break;
            }
        }

        if(!isFruit){
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}

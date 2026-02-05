public class main26 {
    public static void main(String[] args) {

      double result = cube(3);
        System.out.println(result);

//        String fullName = getFullName("Miko", "Berulava");
//        System.out.println(fullName);
//
//        int age = 23;
//
//        if(ageCheck(age)){
//            System.out.println("You may sign up!");
//        } else{
//            System.out.println("You must be 18+ to sign up");
//        }


    }
//    static void happyBirthday(String name, int age){
//        System.out.println("Happy Birthday to you!");
//        System.out.printf("Happy birthday dear %s!\n", name);
//        System.out.printf("You are %d years old!\n", age);
//        System.out.println("Happy birtday to you!\n");
//    }
//    static double square(double number){
//        return  number * number;
//    }

    static double cube(double number){
        return  number * number * number;
    }

//    static String getFullName(String first, String lastname){
//        return first + " " + lastname;}
//    static boolean ageCheck(int age){
//        if(age >= 18){
//            return true;
//        }else{
//            return false;
//        }
//    }
}

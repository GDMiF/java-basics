public class Homework2 {
    public static void main(String[] args){

        var age = 18;
        double price = 7.99;
        char currency = '$';
        boolean legalAge = true;

        String shopName = "Nikora";

        System.out.println("Hi this is " + shopName + " The price of this bear is " + price + " " + currency + " to sell you this your age should be over" + age);
        if(legalAge){
            System.out.println("Yes we can sell you this");
        } else{
            System.out.println("Sry we cant sell you this yet");
        }
    }
}

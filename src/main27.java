public class main27 {
    public static void main(String[] args) {

        String pizza = bakePizaa("flat bred", "mozzarella", "pepperoni");

        System.out.println(pizza);

    }
    static  String bakePizaa(String bread){
        return bread + "pizza";
    }

    static  String bakePizaa(String bread, String cheese){
        return cheese + " " + bread + "pizza";
    }
    static  String bakePizaa(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + "pizza";
    }

}

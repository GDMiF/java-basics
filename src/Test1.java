public class Test1 {
    public static void main(String[] args) {

        double result = cube(3);
        System.out.println(result);

        double sumResult = sub(2,5);
        System.out.println(sumResult);

    }
    static double cube(double cipri){
        return cipri * cipri * cipri;
    }

    static double sub(double sum1, double sum2){
        return sum1 + sum2;
    }

}

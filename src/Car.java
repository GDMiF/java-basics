public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2026;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You Start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You Stop the engine");
    }

    void drive(){
        System.out.println("You Drive the " + model);
    }
    void brake(){
        System.out.println("You brake the " + model);
    }

}

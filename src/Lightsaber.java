public class Lightsaber {

    String color;
    String orden;

    Lightsaber(String color, String orden){
        this.color = color;
        this.orden = orden;
    }

    void starWars(){
        System.out.println("You are a " + this.orden + " You sword is " + color + " color");
    }
}

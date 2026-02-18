public class Homework42 {
    public static void main(String[] args) {

        Lightsaber lightsaber1 = new Lightsaber("Red", "Sith");
        Lightsaber lightsaber2 = new Lightsaber("Blue", "Jedi");
        Lightsaber lightsaber3 = new Lightsaber("Purple", "S L. jackson");

        Lightsaber[] lightsabers = {lightsaber1, lightsaber2, lightsaber3};

//        for(int i = 0; i < 3; i++){
//            lightsabers[i].starWars();
//        }

        for(Lightsaber lightsaber : lightsabers){
            lightsaber.starWars();
        }


    }
    }

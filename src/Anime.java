public class Anime {

    String name;
    String genre;

    Anime(String name, String genr){
        this.name = name;
        this.genre = genre;
    }

    void watch(){
        System.out.println("You Watching the " + this.name + " " + this.genre);
    }
}

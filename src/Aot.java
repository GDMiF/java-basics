public class Aot {

    String name = "Attack on titan";
    int year = 2013;
    double season = 4.0;
    boolean isWatching = true;

    void watchingShow(){
        System.out.println("You are watching the anime");
        isWatching = true;
    }
    void notWatchingShow(){
        System.out.println("You are not watching the anime");
        isWatching = false;
    }

    void whatWatching(){
        System.out.println("You are watching " + name);
    }

    void releaseYear(){
        System.out.println("The release year was " + year);
    }
}

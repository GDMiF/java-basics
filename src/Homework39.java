public class Homework39 {
    public static void main(String[] args) {

        Aot aot = new Aot();

        System.out.println(aot.name);
        System.out.println(aot.year);
        System.out.println(aot.season);
        System.out.println(aot.isWatching);

        aot.watchingShow();
        System.out.println(aot.isWatching);

        aot.notWatchingShow();
        System.out.println(aot.isWatching);

        aot.whatWatching();
        aot.releaseYear();

    }
}

public class main42 {
    public static void main(String[] args) {

        Anime anime1 = new Anime("Naruto", "Shonen");
        Anime anime2 = new Anime("Berserk", "Senen");
        Anime anime3 = new Anime("Your Lie in April", "Drama");

        Anime[] animes = {anime1, anime2, anime3};

        for(Anime anime : animes){
            anime.watch();
        }

    }
}

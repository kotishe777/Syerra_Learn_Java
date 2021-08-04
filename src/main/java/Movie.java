public class Movie {
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println("Проигрывание фильма");
    }
}

class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        one.playIt();

    }
}

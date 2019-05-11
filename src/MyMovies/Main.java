package MyMovies;

public class Main {
    public static void main(String[] args) {
        String moviesPath = "movies.txt";
        MyMovieCollection myMovieCollection = new MyMovieCollection();
        myMovieCollection.readMovieFromFile(moviesPath);
        myMovieCollection.show();
        myMovieCollection.sortMoviesByScore();
        myMovieCollection.show();
        myMovieCollection.sortMoviesByDuration();
        myMovieCollection.show();
        myMovieCollection.sortMoviesByYear();
        myMovieCollection.show();
    }
}

package MyMovies;

import java.io.File;
import java.util.Scanner;

public class MyMovieCollection {

    public static final Integer DEFAULT_SEGMENT_SIZE = 16;
    public Movie[] movies;
    public int size;

    public void readMovieFromFile(String filePath) {
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] split = line.split(",");

                Movie movie = new Movie();
                movie.id = Long.valueOf(split[0]);
                movie.name = split[1];
                movie.duration = Integer.valueOf(split[2]);
                movie.type = split[3];
                movie.genre = split[4];
                movie.score = Double.valueOf(split[5]);
                movie.year = Integer.valueOf(split[6]);

                add(movie);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(movies[i]);
        }
    }

    //Bubble Sort
    public void sortMoviesByYear() {

    }
    public  void sortMoviesByDuration(){

    }
    public void sortMoviesByScore(){

    }

    public MyMovieCollection() {
        movies = new Movie[DEFAULT_SEGMENT_SIZE];
        size = 0;
    }

    public void add(Movie movie) {
        this.movies[size] = movie;
        size++;
    }
}

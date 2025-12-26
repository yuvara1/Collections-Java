package Comparable;

import java.util.Date;
import java.util.Locale;

public class Movie implements Comparable<Movie> {
    static int idCounter = 0;
    Integer movieId;
    String movieName;
    Double rating;
    Date releaseDate;
    Float budget;
    Float boxOfficeCollection;
    String[] actors;
    String director;
    String genre;

    public Movie(String movieName, double rating, Date releaseDate, float budget,
                 float boxOfficeCollection, String[] actors, String director, String genre) {
        this.movieId = ++idCounter;
        this.movieName = movieName;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.budget = budget;
        this.boxOfficeCollection = boxOfficeCollection;
        this.actors = actors;
        this.director = director;
        this.genre = genre;
    }

    public Movie(String movieName) {
        this.movieId = ++idCounter;
        this.movieName = movieName;
    }

    public Movie(String movieName, Date releaseDate) {
        this.movieId = ++idCounter;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
    }


    @Override
    public int compareTo(Movie o) {
        return (this.budget.compareTo(o.budget));
    }

    @Override
    public String toString() {
        return STR."Movie { \n\t\t movieId : \{movieId},\n\t\t movieName : '\{movieName}',\n\t\t rating : \{rating},\n\t\t releaseDate : \{releaseDate.getDate() + "/" + releaseDate.getMonth() + "/" + releaseDate.getYear()},\n\t\t budget : \{String.format(Locale.UK, "%.0f", budget)},\n\t\t boxOfficeCollection : \{String.format(Locale.UK, "%.0f", boxOfficeCollection)}, actors : \{String.join(", ", actors)}, director : '\{director}', genre : '\{genre}'\n\t}";
    }
}

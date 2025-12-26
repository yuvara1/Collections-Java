package Comparable;

import java.util.Date;
import java.util.Locale;

public class Movie implements Comparable<Movie> {
    private static int idCounter = 0;
    private Integer movieId;
    private String movieName;
    private Double rating;
    private Date releaseDate;
    private Float budget;
    private Float boxOfficeCollection;
    private String[] actors;
    private String director;
    private String genre;

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

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Movie.idCounter = idCounter;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    public Float getBoxOfficeCollection() {
        return boxOfficeCollection;
    }

    public void setBoxOfficeCollection(Float boxOfficeCollection) {
        this.boxOfficeCollection = boxOfficeCollection;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

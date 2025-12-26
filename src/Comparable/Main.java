package Comparable;

import java.util.*;

public class Main {
    static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Vikram", 8.5, new Date(2022, 3, 3), 1500000000f,
                6000000000f, new String[]{"Kamal Haasan", "Fahadh Faasil"}, "Lokesh Kanagaraj", "Action"));
        movieList.add(new Movie("KGF Chapter 2", 8.3, new Date(2022, 4, 14), 1000000000f,
                12000000000f, new String[]{"Yash", "Sanjay Dutt"}, "Prashanth Neel", "Action"));
        movieList.add(new Movie("Pushpa", 8.1, new Date(2021, Calendar.JANUARY, 17), 200000000f,
                9000000000f, new String[]{"Allu Arjun", "Rashmika Mandanna"}, "Sukumar", "Action"));
        movieList.add(new Movie("Doctor", 7.5, new Date(2021, 10, 9), 500000000f,
                3000000000f, new String[]{"Sivakarthikeyan", "Priyanka Arul Mohan"}, "Nelson Dilipkumar", "Comedy"));
        movieList.add(new Movie("Master", 7.8, new Date(2021, 1, 13), 1200000000f,
                4300000000f, new String[]{"Vijay", "Vijay Sethupathi"}, "Lokesh Kanagaraj", "Action"));
        movieList.add(new Movie("Soorarai Pottru", 8.7, new Date(2020, 11, 12), 300000000f,
                1500000000f, new String[]{"Suriya", "Aparna Balamurali"}, "Sudha Kongara", "Drama"));
        System.out.println("Movies sorted by Rating:");
        Collections.sort(movieList);
        Iterator<Movie> iterator = movieList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }


}

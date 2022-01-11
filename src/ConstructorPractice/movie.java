package ConstructorPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class movie {
    public String country, title, genre, releaseDate, director;
    public ArrayList<String>casts=new ArrayList<>();

    public movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String str1){
    casts.add(str1);
    }

    public void addCasts(String[] str2){
        casts.addAll(Arrays.asList(str2));
    }

    public String toString() {
        return "movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                '}';
    }
}

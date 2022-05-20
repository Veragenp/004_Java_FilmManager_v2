package ru.netology.domain;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class FilmItem {
    private int id;
    private String name;
    private String genre;
    //private String image;
    private boolean isTomorrow;

    public FilmItem(int id, String name, String genre, boolean isTomorrow) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.isTomorrow = isTomorrow;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isTomorrow() {
        return isTomorrow;
    }

    public void setTomorrow(boolean tomorrow) {
        isTomorrow = tomorrow;
    }
}


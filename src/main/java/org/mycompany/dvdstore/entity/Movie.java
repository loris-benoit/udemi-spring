package org.mycompany.dvdstore.entity;

import java.util.List;

public class Movie {

    private String title;

    private String genre;

    private Long stock;

    private String mainActorName;

    private List<String> secondaryActorsNames;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getMainActorName() {
        return mainActorName;
    }

    public void setMainActorName(String mainActorName) {
        this.mainActorName = mainActorName;
    }

    public List<String> getSecondaryActorsNames() {
        return secondaryActorsNames;
    }

    public void setSecondaryActorsNames(List<String> secondaryActorsNames) {
        this.secondaryActorsNames = secondaryActorsNames;
    }
}

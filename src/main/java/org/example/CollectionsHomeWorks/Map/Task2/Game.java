package org.example.CollectionsHomeWorks.Map.Task2;

import java.time.LocalDate;

public class Game {
    private String name;
    private double price;
    private LocalDate releaseDate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }


    public Game(String name, double price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "name: " + name + "  |  " +  "price: " + price + "  |  " + "releaseDate: " + releaseDate;
    }
}



package com.rajasthantour;



public class City {
    private String name;
    private int numOfplaces;
    private int thumbnail;

    public City() {
    }

    public City(String name, int numOfplaces, int thumbnail) {
        this.name = name;
        this.numOfplaces = numOfplaces;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPlaces() {
        return numOfplaces;
    }

    public void setNumOfPlaces(int numOfplaces) {
        this.numOfplaces = numOfplaces;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}

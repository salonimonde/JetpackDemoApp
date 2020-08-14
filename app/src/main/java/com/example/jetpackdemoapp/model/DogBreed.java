package com.example.jetpackdemoapp.model;

public class DogBreed {
    public String breedId;
    public String dogBreed;
    public String lifespan;
    public String breedGroup;
    public String bredFor;
    public String temperament;
    public String imageUrl;
    public int uui;

    public DogBreed(String breedId, String dogBreed, String lifespan, String breedGroup, String bredFor, String temperament, String imageUrl) {
        this.breedId = breedId;
        this.dogBreed = dogBreed;
        this.lifespan = lifespan;
        this.breedGroup = breedGroup;
        this.bredFor = bredFor;
        this.temperament = temperament;
        this.imageUrl = imageUrl;
    }
}

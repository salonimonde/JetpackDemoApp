package com.example.jetpackdemoapp.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface DogsApi {
    @GET("DevTides/DogsApi/master/dogs.json")
    Single<List<DogBreed>> getDogs();

    /** For another endpoint, write similar code*/
    /*@GET("DevTides/DogsApi/master/dogs.json")
    Single<List<Cats>> getCats();*/
}

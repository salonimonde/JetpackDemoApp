package com.example.jetpackdemoapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.jetpackdemoapp.model.DogBreed;

import java.util.ArrayList;
import java.util.List;

public class ListViewModel extends AndroidViewModel {

    public MutableLiveData<List<DogBreed>> dogs = new MutableLiveData<List<DogBreed>>();
    public MutableLiveData<Boolean> dogLoadError = new MutableLiveData<Boolean>();
    public MutableLiveData<Boolean> loading = new MutableLiveData<Boolean>();

    public ListViewModel(@NonNull Application application) {
        super(application);
    }

    public void refresh(){
        DogBreed dog1 = new DogBreed("1","corgi","15 years","","","","");
        DogBreed dog2 = new DogBreed("2","rotwailler","10 years","","","","");
        DogBreed dog3 = new DogBreed("3","labrador","13 years","","","","");
        DogBreed dog4 = new DogBreed("3","labrador","13 years","","","","");
        DogBreed dog5 = new DogBreed("3","labrador","13 years","","","","");
        DogBreed dog6 = new DogBreed("3","labrador","13 years","","","","");
        DogBreed dog7 = new DogBreed("3","labrador","13 years","","","","");

        ArrayList<DogBreed> dogsList = new ArrayList<>();
        dogsList.add(dog1);
        dogsList.add(dog2);
        dogsList.add(dog3);
        dogsList.add(dog4);
        dogsList.add(dog5);
        dogsList.add(dog6);
        dogsList.add(dog7);

        dogs.setValue(dogsList);
        dogLoadError.setValue(false);
        loading.setValue(false);
    }
}

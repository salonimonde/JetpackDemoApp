package com.example.jetpackdemoapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import com.example.jetpackdemoapp.model.DogBreed;

public class DetailViewModel extends ViewModel {

    public MutableLiveData<DogBreed> dogLiveData = new MutableLiveData<DogBreed>();

    public void fetch() {
        DogBreed dog1 = new DogBreed("1", "corgi", "15 years", "", "companionship",
                "calm and friendly", "");

        dogLiveData.setValue(dog1);
    }

}

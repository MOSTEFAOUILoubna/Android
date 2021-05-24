package com.example.applicationtest;


import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ViewModel extends AndroidViewModel {

    Repository myRepository;

    LiveData<List<Categories>> listecategories;
    LiveData<List<Aliments>> listealiments;
    //LiveData<List<Categories>> listecategorie;
    // LiveData<List<Aliments>> listealiment;

    public ViewModel(Application application) {
        super(application);

        myRepository = new Repository(application);
        // Recuperer liste des catégories et liste des aliments

        listealiments = myRepository.getListaliments();  // viewmodel -> Dao -> Bdd
        listecategories = myRepository.getListcategories();
    }
}

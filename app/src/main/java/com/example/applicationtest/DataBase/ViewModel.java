package com.example.applicationtest.DataBase;


import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.applicationtest.DataBase.Repository;
import com.example.applicationtest.Models.Aliments;
import com.example.applicationtest.Models.Categories;

import java.util.List;

public class ViewModel extends AndroidViewModel {

    Repository myRepository;

    LiveData<List<Categories>> listeCategories;
    LiveData<List<Aliments>> listeAliments;

    public ViewModel(Application application) {
        super(application);

        myRepository = new Repository(application);
        // Recuperer liste des catégories et liste des aliments

        listeAliments = myRepository.getListaliments();  // viewmodel -> Dao -> Bdd
        listeCategories = myRepository.getListcategories();
    }
    LiveData<List<Categories>> getAllCategories() { return listeCategories; }
    LiveData<List<Aliments>> getAllAliments() { return listeAliments; }
}

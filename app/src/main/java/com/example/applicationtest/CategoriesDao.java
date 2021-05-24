package com.example.applicationtest;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CategoriesDao {

    @Insert
    void insert(Categories categorie);

    @Update
    void update(Categories categorie);

    @Delete
    void delete(Categories categorie);

    @Query("DELETE FROM Categories_table")
    void deleteAllCategories();

    @Query("select * from Categories_table")
    LiveData<List<Categories>> getAllCategories();

    // @Query("select * from Categories_table")
    //LiveData<List<Categories>> getCategoriesById();
}

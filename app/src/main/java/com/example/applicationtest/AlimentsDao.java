package com.example.applicationtest;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao

public interface AlimentsDao {

    @Insert
    void insert(Aliments aliments);

    @Delete
    void delete(Aliments aliments);

    @Update
    void update(Aliments aliments);

    @Query("DELETE FROM Aliments_table")
    void deleteAllAliments();

    @Query("select * from Aliments_table")
    LiveData<List<Aliments>> getAllAliments();

    //@Query("select * from Aliments_table")
    //LiveData<List<Aliments>> getAlimentsById();
}


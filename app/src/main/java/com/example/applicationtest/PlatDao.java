package com.example.applicationtest;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
    public interface PlatDao {

        @Insert
        void insert(Plat plat);

        @Update
        void update(Plat plat);

        @Delete
        void delete(Plat plat);

    }

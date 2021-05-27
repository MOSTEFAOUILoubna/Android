package com.example.applicationtest.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import com.example.applicationtest.Models.Plat;

@Dao
    public interface PlatDao {

        @Insert
        void insert(Plat plat);

        @Update
        void update(Plat plat);

        @Delete
        void delete(Plat plat);

    }

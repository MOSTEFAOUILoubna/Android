package com.example.applicationtest.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.applicationtest.DAOs.AlimentsDao;
import com.example.applicationtest.DAOs.CategoriesDao;
import com.example.applicationtest.DAOs.PlatDao;
import com.example.applicationtest.Models.Aliments;
import com.example.applicationtest.Models.Categories;
import com.example.applicationtest.Models.Plat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Database(entities = {Plat.class  , Categories.class , Aliments.class} , version = 3 , exportSchema = false)

    public abstract  class DataBase extends RoomDatabase {

        private static DataBase bd;

        public abstract PlatDao platDao();
        public abstract CategoriesDao categoriesDao();
        public abstract AlimentsDao alimentsDao();

        public static synchronized DataBase getInstance(Context context) {
            if (bd == null) {
                synchronized (DataBase.class){
                    if (bd == null){
                        bd= Room.databaseBuilder(context, DataBase.class, "MYDATABASE").build();
                    }
                }
            }
            return bd;

        }
}

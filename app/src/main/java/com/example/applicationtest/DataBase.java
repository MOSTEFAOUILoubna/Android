package com.example.applicationtest;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


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
                        bd= Room.databaseBuilder(context, DataBase.class, "data").build();
                    }
                }
            }
            return bd;

        }
}

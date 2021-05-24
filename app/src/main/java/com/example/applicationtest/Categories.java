package com.example.applicationtest;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Categories_table")
    public class Categories {
        @PrimaryKey(autoGenerate = true)

        private int id;
        private String name;


        public Categories(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }



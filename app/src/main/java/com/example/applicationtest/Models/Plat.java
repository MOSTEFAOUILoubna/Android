package com.example.applicationtest.Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Plat_table")

public class Plat {


        @PrimaryKey(autoGenerate = true)
        private int id;
        private String name;

        public Plat(String name)
        { this.name=name;}

        public int getId() {
            return id;
        }

        public String getName() {
            return name; }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }





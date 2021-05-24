package com.example.applicationtest;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "Aliments_table")


public class Aliments {

        @PrimaryKey(autoGenerate = true)
        private int id;
        private String name;
        private Categories catégorie; //
        private double quantité;
        private double glu;

        public Aliments(String name, double quantité, double glu) {
            this.name = name;
            this.catégorie = catégorie;
            this.quantité = quantité;
            this.glu=glu;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Categories getCatégorie() {
            return catégorie;
        }

        public double getQuantité() {
            return quantité;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCatégorie(Categories catégorie) {
            this.catégorie = catégorie;
        }

        public void setQuantité(double quantité) {
            this.quantité = quantité;
        }

        public double getGlu() {
            return glu;
        }

        public void setGlu(double glu) {
            this.glu = glu;
        }
    }



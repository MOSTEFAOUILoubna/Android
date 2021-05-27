package com.example.applicationtest.Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Aliments_table")
public class Aliments {

        @PrimaryKey(autoGenerate = true)
        private int id;
        private String name;
        private String categories;
        private double quantite;
        private double glu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getGlu() {
        return glu;
    }

    public void setGlu(double glu) {
        this.glu = glu;
    }

    public Aliments() {
    }

    public Aliments(int id, String name, String categories, double quantite, double glu) {
        this.id = id;
        this.name = name;
        this.categories = categories;
        this.quantite = quantite;
        this.glu = glu;
    }
}



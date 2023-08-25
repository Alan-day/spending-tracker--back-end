package com.example.expensetrackerbackend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Expense {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)


    private int id;
    private String date;
    private String picture;
    private double spent;

    private String category;

    public Expense(String date, double spent, String category, int id, String picture) {
        this.date = date;
        this.spent = spent;
        this.category = category;
        this.id = id;
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent= spent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



}

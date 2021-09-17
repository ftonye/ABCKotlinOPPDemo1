package com.teccart.mb1.abckotlinoppdemo1;

public class lagumes {
    private String nom;
    private Double price;
    private String color;

    public lagumes(String nom, Double price, String color) {
        this.nom = nom;
        this.price = price;
        this.color = color;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

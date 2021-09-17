package com.teccart.mb1.abckotlinoppdemo1;

public class Meat implements Itaxable{
    private String type;
    private Double price;
    private double kg;

    public Meat(String type, Double price, double kg) {
        this.type = type;
        this.price = price;
        this.kg = kg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    @Override
    public double calTaxes() {
        return 0;
    }
}

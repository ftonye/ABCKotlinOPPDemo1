package com.teccart.mb1.abckotlinoppdemo1;

public class StudentJJ extends StudentJ{
    private double kg;

    public StudentJJ(double kg) {
        this.kg = kg;
    }

    public StudentJJ(String name, double kg) {
        super(name);
        this.kg = kg;
    }

    public StudentJJ(String name, int age, double kg) {
        super(name, age);
        this.kg = kg;
    }

    public StudentJJ(String name, int age, double height, double kg) {
        super(name, age, height);
        this.kg = kg;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    @Override
    public String demoNonStatic() {
        return super.demoNonStatic()+ "de la classe enfant JJ";
    }
}

package com.teccart.mb1.abckotlinoppdemo1;

public class StudentJ {
    private String name;
    private int age;
    private double height;

    public StudentJ() {  //equ secondaire #1 kotlin
        this.name = "Jhon Doe";
        this.age = 18;
        this.height = 1.60;
    }
    public StudentJ(String name) {//equ secondaire #2 kotlin
        this.name = name;
        this.age = 18;
        this.height = 1.60;
    }
    public StudentJ(String name, int age) {//equ secondaire #3 kotlin
        this.name = name;
        this.age = age;
        this.height = 1.60;
    }
    public StudentJ(String name, int age, double height) { //equ primaire kotlin
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static String demoStatic()
    {
        return "Je suis une methode statique";
    }

    public  String demoNonStatic()
    {
        return "Je suis une methode non statique";
    }
}

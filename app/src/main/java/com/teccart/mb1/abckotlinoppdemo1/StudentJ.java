package com.teccart.mb1.abckotlinoppdemo1;

public class StudentJ {
    public String name;
    public int age;
    public double height;

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
}

package com.teccart.mb1.abckotlinoppdemo1

class StudentK(var name:String,var age:Int,var height:Double){
    constructor():this("Jhon Doe",18,1.60)//secondaire #1
    constructor(name: String):this(name,18,1.60)//secondaire #2
    constructor(name: String,age: Int):this(name,age,1.60)//equ secondaire #3 kotlin

}
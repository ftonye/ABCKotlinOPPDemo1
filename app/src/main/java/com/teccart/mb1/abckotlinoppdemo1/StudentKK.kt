package com.teccart.mb1.abckotlinoppdemo1

class StudentKK( _name:String,_age:Int,_height:Double,_kg:Double):StudentK(_name, _age, _height)
{
    private var kg:Double

    init {
        this.kg = _kg
    }

    override fun demoNonStatic(): String {
        return super.demoNonStatic() + "de la classe enfant kk"


    }
}
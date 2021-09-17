package com.teccart.mb1.abckotlinoppdemo1

class StudentK( _name:String,_age:Int,_height:Double){
    constructor():this("Jhon Doe",18,1.60)//secondaire #1
    constructor(name: String):this(name,18,1.60)//secondaire #2
    constructor(name: String,age: Int):this(name,age,1.60)//equ secondaire #3 kotlin

    private var name:String;
    private var age:Int;
    private var height:Double;

    init {
        this.age = _age
        this.name = _name
        this.height = _height
    }

    /*fun getName():String{
        return this.name
    }*/
    fun getName() = this.name
    fun setName(n:String){
        this.name = n
    }

    /*fun getAge():Int{
       return this.age
   }*/
    fun getAge() = this.age
    fun setAge(a:Int){
        this.age = a
    }

    /*fun getHeight():Double{
      return this.height
  }*/
    fun getHeight() = this.height
    fun setHeight(h:Double){
        this.height = h
    }

   /* fun demoNonStatic():String{
        return "je suis une methode non statique"
    }*/
   fun demoNonStatic()="je suis une methode non statique"

    companion object test{
        /* fun demoStatic():String{
       return "je suis une methode  statique"
   }*/
        fun demoStatic()= "je suis une methode statique"
    }
}
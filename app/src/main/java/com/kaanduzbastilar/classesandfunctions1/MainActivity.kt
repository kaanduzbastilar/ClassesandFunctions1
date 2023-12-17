 package com.kaanduzbastilar.classesandfunctions1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

 class MainActivity : AppCompatActivity() {

     private lateinit var myTextView: TextView
     private lateinit var myButton : Button
     private lateinit var nameText : EditText
     private lateinit var ageText: EditText
     private lateinit var jobText: EditText

     var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)
        nameText = findViewById(R.id.nameText)
        ageText = findViewById(R.id.ageText)
        jobText = findViewById(R.id.jobText)

        /*myButton.setOnClickListener{
            myTextView.text = "Button Clicked 2"
        }

         */

        test()
        mySum(10,15)

        val sumResult = mySum(40,35)
        val result = myMultipler(10,20)

        println(sumResult)
        println(result)


        //Class
        /*

        val homer = Simpson()
        homer.name = "Homer Simpson"
        homer.age = 50
        homer.job = "Nuclear"
        println(homer.name)

        val bart = Simpson()

         */

        //Nullability

        var myString : String? = null
        myString = "test"
        println(myString)

        var myAge : Int? = null

        //1) !! kesin null değil
        // println(myAge!! * 10)

        //2)safe call
        println(myAge?.minus(10))

        //3)
        if (myAge != null){
           println(myAge.minus(10))
        }else
        {
            println("myAge is null")
        }

        //4) elvis operator

        println(myAge?.minus(10) ?: -10)

        //5)
        myAge?.let {
            println(it * 10)
        }








        val homer = Simpson("Homer Simpson", 50, "Nuclear", 100 )
        homer.name = "Homer"
        println(homer.name)
        homer.setHeight(50)





    }

    fun test(){
        // println("test func")
    }

    fun mySum(a : Int, b : Int){
        //println(a+b);
        //val myTextView = findViewById<TextView>(R.id.textView)
        //myTextView.text = "Result : ${a+b}"
    }

    fun myMultipler(x: Int,y: Int) : Int {
        myTextView.text = "Result : ${x*y}"
        return x * y
        //val result = x * y
        //return result
    }

    fun buttonClicked(view : View){

        //Scope
        name =  nameText.text.toString()
        val age = ageText.text.toString().toIntOrNull()
        val job = jobText.text.toString()

        if(age!=null){
           val simpson = Simpson(name, age, job, weight = 100)
           myTextView.text = "Name : ${simpson.name}, Age : ${simpson.age}, Job : ${simpson.job}" 
        }else{
           myTextView.text = "Enter your age!"
        }



        

    }



}
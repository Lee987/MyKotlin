package com.example.administrator.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun add(x:Int,y:Int):Int{
        return x+y
    }

    fun toast(msg:String,length:Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,msg,length).show()
    }
}

package com.example.administrator.mykotlin

import android.content.Context
import android.widget.Toast


fun Context.toast(id:Int,leangth:Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,id,leangth).show()
}

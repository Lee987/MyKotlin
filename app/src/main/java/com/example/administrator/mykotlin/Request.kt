package com.example.administrator.mykotlin

import android.util.Log
import com.google.gson.Gson
import java.net.URL

public class Request(val url:String) {
    public fun run():Forecast{
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName,forecastJsonStr)
        return Gson().fromJson(forecastJsonStr,Forecast::class.java)
    }
}
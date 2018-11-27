package com.example.administrator.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager

import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val items = listOf(
            "Mon	6/23	-	Sunny	-	31/17",
            "Tue	6/24	-	Foggy	-	21/8",
            "Wed	6/25	-	Cloudy	-	22/17",
            "Thurs	6/26	-	Rainy	-	18/11",
            "Fri	6/27	-	Foggy	-	21/10",
            "Sat	6/28	-	TRAPPED	IN	WEATHERSTATION	-	23/18",
            "Sun	6/29	-	Sunny	-	20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val list = findViewById<RecyclerView>(R.id.list)
        val list: RecyclerView = find(R.id.list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = ForecastListAdapter(items)
        //toast(R.string.app_name, 3000)
        btn_ok.setOnClickListener {
            async {
                val forecast = Request("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").run()
                uiThread { longToast("Request----->" + forecast.weather[0].description) }
            }
        }
    }


    fun add(x: Int, y: Int): Int {
        return x + y
    }

//    fun toast(msg:String,length:Int = Toast.LENGTH_SHORT){
//        Toast.makeText(this,msg,length).show()
//    }
}

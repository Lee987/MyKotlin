package com.example.administrator.mykotlin

import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import java.util.*

data class Forecast(val coord: Coord, val weather: List<Weather>, val base: String, val main: Main, val wind: Wind, val clouds: Clouds, val dt: Double, val sys: Sys, val id: Double, val name: String, val cod: Int)

data class Coord(val lon: Double, val lat: Double)

data class Weather(val id: Double, val main: String, val description: String, val icon: String)

data class Main(val temp: Double, val pressure: Double, val humidity: Int, val temp_min: Double, val temp_max: Double, val sea_level: Double, val grnd_level: Double)

data class Wind(val speed: Double, val deg: Int)

data class Clouds(val all: Int)

data class Sys(val message: Double, val country: String, val sunrise: Double, val sunset: Double)




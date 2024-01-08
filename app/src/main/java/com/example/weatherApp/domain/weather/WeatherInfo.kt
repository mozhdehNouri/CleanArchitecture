package com.example.weatherApp.domain.weather

data class WeatherInfo(
    val weatherDatePreDay: Map<Int, WeatherData>,
    val currentWeatherData: WeatherData
)

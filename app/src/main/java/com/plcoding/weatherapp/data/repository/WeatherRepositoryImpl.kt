package com.plcoding.weatherapp.data.repository

import app.src.main.java.com.plcoding.weatherapp.domain.repository.WeatherRepository

import com.plcoding.weatherapp.domain.weather.WeatherInfo
import com.plcoding.weatherapp.data.remote.WeatherApi
import com.plcoding.weatherapp.domain.util.Resource

class WeatherRepositoryImpl (
    private val api: WeatherApi
        ): WeatherRepository{
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        TODO("Not yet implemented")
    }
        }



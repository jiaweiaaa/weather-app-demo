package com.plcoding.weatherapp.di

import android.location.Location
import app.src.main.java.com.plcoding.weatherapp.domain.repository.WeatherRepository
import com.plcoding.weatherapp.data.location.DefaultLocationTracker
import com.plcoding.weatherapp.data.repository.WeatherRepositoryImpl
import com.plcoding.weatherapp.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}
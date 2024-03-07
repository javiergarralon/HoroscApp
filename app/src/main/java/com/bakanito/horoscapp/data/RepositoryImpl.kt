package com.bakanito.horoscapp.data

import android.util.Log
import com.bakanito.horoscapp.data.network.HoroscopeApiService
import com.bakanito.horoscapp.domain.Repository
import com.bakanito.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        //Petición Retrofit
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("HOROSCAPP", "ERROR ${it.message}") }

        return null
    }
}
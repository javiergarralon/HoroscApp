package com.bakanito.horoscapp.domain

import com.bakanito.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}
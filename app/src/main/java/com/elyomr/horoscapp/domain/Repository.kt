package com.elyomr.horoscapp.domain

import com.elyomr.horoscapp.domain.model.PredictionModel


interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}
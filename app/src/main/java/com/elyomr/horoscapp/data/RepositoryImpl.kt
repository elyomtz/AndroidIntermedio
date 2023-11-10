package com.elyomr.horoscapp.data

import android.util.Log
import com.elyomr.horoscapp.data.network.HoroscopeApiService
import com.elyomr.horoscapp.data.network.response.PredictionResponse
import com.elyomr.horoscapp.domain.Repository
import com.elyomr.horoscapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService):Repository {
    override suspend fun getPrediction(sign: String) : PredictionModel? {
       runCatching { apiService.getHoroscope(sign) }
           .onSuccess { return it.toDomain() }
           .onFailure { Log.i("ElyoMR", "Ha ocurrido un error ${it.message}") }
        return null
    }
}
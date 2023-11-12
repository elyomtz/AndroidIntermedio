package com.elyomr.horoscapp.data.network.response

import com.elyomr.horoscapp.motherobject.HoroscopeMotherObject
import com.elyomr.horoscapp.motherobject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Assert.*
import org.junit.Test

class PredictionResponseTest{
    @Test
    fun `toDomain Should Return A Correct PredictionModel`(){
        //Given
        val horoscopeResponse = anyResponse
        //When
        val predictionModel = horoscopeResponse.toDomain()
        //Then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope

    }
}
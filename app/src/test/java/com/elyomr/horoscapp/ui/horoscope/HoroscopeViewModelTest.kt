package com.elyomr.horoscapp.ui.horoscope

import com.elyomr.horoscapp.data.providers.HoroscopeProvider
import com.elyomr.horoscapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import com.elyomr.horoscapp.ui.providers.RandomCardProvider
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest{

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel

    @Before
    fun setup(){
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewmodel is created then horoscopes are loaded`(){
        every{horoscopeProvider.getHoroscopes()} returns horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())
    }
}
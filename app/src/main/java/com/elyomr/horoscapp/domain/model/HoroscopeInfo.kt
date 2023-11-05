package com.elyomr.horoscapp.domain.model

import com.elyomr.horoscapp.R

sealed class HoroscopeInfo(val img:Int, val name:Int){
    object Aries:HoroscopeInfo()
}
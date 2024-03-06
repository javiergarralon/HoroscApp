package com.bakanito.horoscapp.data.providers

import com.bakanito.horoscapp.domain.model.HoroscopeInfo
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Aries
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Leo
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Libra
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.bakanito.horoscapp.domain.model.HoroscopeInfo.Virgo
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}
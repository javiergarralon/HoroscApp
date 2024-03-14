package com.bakanito.horoscapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest{
    @Test
    fun `getRandomCard should return a random card`(){
        val randomCardProvider = RandomCardProvider()

        val card = randomCardProvider.getLucky()

        assertNotNull(card)
    }

}
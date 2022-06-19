package com.danielqueiroz.domain.repository

import com.danielqueiroz.api.response.HeroResponse
import com.danielqueiroz.domain.model.Hero

interface HeroRepository {

    val heroes: Map<Int, List<Hero>>

    val pageOne: List<Hero>
    val pageTwo: List<Hero>
    val pageThree: List<Hero>
    val pageFour: List<Hero>
    val pageFive: List<Hero>

    suspend fun getAllHeroes(page: Int = 1): HeroResponse
    suspend fun searchHeroes(name: String?): HeroResponse
}
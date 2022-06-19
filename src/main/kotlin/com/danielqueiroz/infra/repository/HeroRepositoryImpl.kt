package com.danielqueiroz.infra.repository

import com.danielqueiroz.api.response.HeroResponse
import com.danielqueiroz.domain.model.Hero
import com.danielqueiroz.domain.repository.HeroRepository

class HeroRepositoryImpl : HeroRepository {

    override val heroes: Map<Int, List<Hero>>
        get() = TODO("Not yet implemented")
    override val pageOne: List<Hero>
        get() = TODO("Not yet implemented")
    override val pageTwo: List<Hero>
        get() = TODO("Not yet implemented")
    override val pageThree: List<Hero>
        get() = TODO("Not yet implemented")
    override val pageFour: List<Hero>
        get() = TODO("Not yet implemented")
    override val pageFive: List<Hero>
        get() = TODO("Not yet implemented")

    override suspend fun getAllHeroes(page: Int): HeroResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchHeroes(name: String): HeroResponse {
        TODO("Not yet implemented")
    }
}
package com.danielqueiroz.api.routes

import com.danielqueiroz.api.response.HeroResponse
import com.danielqueiroz.domain.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllHeroes() {

    val heroRepository: HeroRepository by inject()

    get("/boruto/heroes") {
        val page = call.request.queryParameters["page"]?.toInt() ?: 1
        require(page in 1..5)

        val heroResponse = heroRepository.getAllHeroes(page)

        call.respond(
            message = heroResponse,
            status = HttpStatusCode.OK
        )
    }
}
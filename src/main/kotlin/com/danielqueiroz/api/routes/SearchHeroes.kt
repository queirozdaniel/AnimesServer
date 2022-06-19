package com.danielqueiroz.api.routes

import com.danielqueiroz.domain.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {
    val heroRepository: HeroRepository by inject()

    get("/boruto/heroes/search") {
        val name = call.request.queryParameters["name"]
        val heroResponse = heroRepository.searchHeroes(name)

        call.respond(
            message = heroResponse,
            status = HttpStatusCode.OK
        )
    }

}
package com.danielqueiroz.infra.plugins

import com.danielqueiroz.api.response.HeroResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

fun Application.configureStatusPage() {
    install(StatusPages) {

        exception <NumberFormatException> { call, cause ->
            call.respond(
                message = HeroResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        }
        exception <IllegalArgumentException> { call, cause ->
            call.respond(
                message = HeroResponse(success = false, message = "Heroes not Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}
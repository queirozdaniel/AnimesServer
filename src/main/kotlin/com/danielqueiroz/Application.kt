package com.danielqueiroz

import io.ktor.server.application.*
import com.danielqueiroz.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureRouting()
    configureMonitoring()
    configureSerialization()
}

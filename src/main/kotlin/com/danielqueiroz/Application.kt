package com.danielqueiroz

import com.danielqueiroz.infra.plugins.configureDefaultHeader
import com.danielqueiroz.infra.plugins.configureKoin
import com.danielqueiroz.infra.plugins.configureRouting
import com.danielqueiroz.infra.plugins.configureSerialization
import io.ktor.server.application.*
import com.danielqueiroz.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureRouting()
    configureMonitoring()
    configureSerialization()
    configureDefaultHeader()
}

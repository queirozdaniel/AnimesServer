package com.danielqueiroz.infra.plugins

import com.danielqueiroz.infra.di.koinModule
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.SLF4JLogger

fun Application.configureKoin() {
    install(Koin){
        SLF4JLogger()
        modules(koinModule)
    }
}

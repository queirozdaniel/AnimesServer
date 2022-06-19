package com.danielqueiroz.infra.di

import com.danielqueiroz.domain.repository.HeroRepository
import com.danielqueiroz.infra.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}
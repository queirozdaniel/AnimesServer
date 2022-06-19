package com.danielqueiroz.api.response

import com.danielqueiroz.domain.model.Hero
import kotlinx.serialization.Serializable

@Serializable
data class HeroResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val heroes: List<Hero> = emptyList()
)

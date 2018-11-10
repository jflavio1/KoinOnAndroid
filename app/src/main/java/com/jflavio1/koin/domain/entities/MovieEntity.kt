package com.jflavio1.koin.domain.entities

/**
 * MovieEntity
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
data class MovieEntity (
    val id: String? = null,
    val name: String,
    val genre: String,
    val duration: String,
    val rating: Int = 3
)
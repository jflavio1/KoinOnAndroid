package com.jflavio1.koin.domain

import com.jflavio1.koin.domain.entities.MovieEntity

/**
 * MovieRepository
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
interface MovieRepository : BaseRepository<MovieEntity> {

    fun listByGenre(genreName: String, onSuccess: (List<MovieEntity>) -> Unit, onFailure: (Exception) -> Unit)

}
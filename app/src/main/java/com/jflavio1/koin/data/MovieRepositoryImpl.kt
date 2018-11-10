package com.jflavio1.koin.data

import com.jflavio1.koin.domain.MovieRepository
import com.jflavio1.koin.domain.entities.MovieEntity

/**
 * MovieRepository
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
class MovieRepositoryImpl : MovieRepository {

    override fun listByGenre(
        genreName: String,
        onSuccess: (List<MovieEntity>) -> Unit,
        onFailure: (Exception) -> Unit
    ) {

    }

    override fun add(obj: MovieEntity, onSuccess: (MovieEntity) -> Unit, onFailure: (Exception) -> Unit) {
    }

    override fun removeById(id: String, onSuccess: (MovieEntity) -> Unit, onFailure: (Exception) -> Unit) {
    }

}
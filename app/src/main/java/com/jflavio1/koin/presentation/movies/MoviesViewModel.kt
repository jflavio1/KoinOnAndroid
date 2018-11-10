package com.jflavio1.koin.presentation.movies

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.jflavio1.koin.domain.MovieRepository
import com.jflavio1.koin.domain.entities.MovieEntity
import com.jflavio1.koin.utils.LoadState

/**
 * MoviesViewModel
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
class MoviesViewModel(val moviesRepo: MovieRepository) : ViewModel() {

    var moviesLoadState = MutableLiveData<LoadState>()

    fun getMovieListByGenre(genre: String) {
        moviesLoadState.postValue(LoadState.load())
        moviesRepo.listByGenre(genre, { list ->
            moviesLoadState.postValue(LoadState.success(list))
        }, { error ->
            moviesLoadState.postValue(LoadState.error(error))
        })
    }

}
package com.jflavio1.koin.presentation.movies

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.jflavio1.koin.R
import com.jflavio1.koin.domain.entities.MovieEntity
import com.jflavio1.koin.utils.LoadState
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * @author Jose Flavio
 */
class MoviesActivity : AppCompatActivity() {

    private val vm: MoviesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.moviesLoadState.observe(this, Observer { loadState ->

            when (loadState?.state) {

                LoadState.STATE_LOADING -> showLoader()

                LoadState.STATE_ERROR -> {
                    hideLoader()
                    Toast.makeText(this, "Error! ${loadState.exception.toString()}" , Toast.LENGTH_SHORT).show()
                }

                LoadState.STATE_SUCCESS -> {
                    hideLoader()
                    showMovies(loadState.obj as List<MovieEntity>)
                }

            }

        })

        vm.getMovieListByGenre("horror")

    }

    fun showMovies(list: List<MovieEntity>){

    }

    fun showLoader() {

    }

    fun hideLoader() {

    }
}

package com.jflavio1.koin.presentation.genres.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jflavio1.koin.R
import com.jflavio1.koin.domain.entities.Genre
import com.jflavio1.koin.presentation.genres.presenter.GenresPresenter
import com.jflavio1.koin.presentation.genres.view.GenresView
import org.koin.android.ext.android.inject

/**
 * @author Jose Flavio
 */
class GenresActivity : AppCompatActivity(), GenresView {

    private val presenter: GenresPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genres)
        presenter.initView(this)
        presenter.loadGenres()
    }

    override fun showGenres(list: List<Genre>) {
    }

    override fun errorOnLoading(e: Exception, errorCode: Int?) {
    }

    override fun showLoader() {
    }

    override fun hideLoader() {
    }
}

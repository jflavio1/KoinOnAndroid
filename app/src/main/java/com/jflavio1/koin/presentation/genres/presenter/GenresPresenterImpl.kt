package com.jflavio1.koin.presentation.genres.presenter

import com.jflavio1.koin.presentation.genres.view.GenresView

/**
 * GenresPresenterImpl
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
class GenresPresenterImpl : GenresPresenter {

    private lateinit var view: GenresView

    override fun initView(view: GenresView) {
        this.view = view
    }

    override fun loadGenres() {
        this.view.showLoader()
        this.view.showGenres(listOf())
        this.view.hideLoader()
    }

}
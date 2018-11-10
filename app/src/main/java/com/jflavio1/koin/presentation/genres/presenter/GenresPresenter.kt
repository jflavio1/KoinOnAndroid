package com.jflavio1.koin.presentation.genres.presenter

import com.jflavio1.koin.presentation.BasePresenter
import com.jflavio1.koin.presentation.genres.view.GenresView

/**
 * GenresPresenter
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
interface GenresPresenter : BasePresenter<GenresView> {

    fun loadGenres()

}
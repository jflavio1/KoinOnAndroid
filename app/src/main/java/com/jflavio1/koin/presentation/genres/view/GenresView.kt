package com.jflavio1.koin.presentation.genres.view

import com.jflavio1.koin.domain.entities.Genre

/**
 * GenresView
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
interface GenresView {

    fun showGenres(list: List<Genre>)

    fun errorOnLoading(e: Exception, errorCode: Int? = -1)

    fun showLoader()

    fun hideLoader()

}
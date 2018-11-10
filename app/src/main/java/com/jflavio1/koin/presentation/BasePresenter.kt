package com.jflavio1.koin.presentation

/**
 * BasePresenter
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
interface BasePresenter<View> {
    fun initView(view: View)
}
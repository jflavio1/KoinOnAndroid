package com.jflavio1.koin.domain

/**
 * BaseRepository
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  10/11/17
 */
interface BaseRepository<T> {

    fun add(obj: T, onSuccess: (T) -> Unit, onFailure: (Exception) -> Unit)

    fun removeById(id: String, onSuccess: (T) -> Unit, onFailure: (Exception) -> Unit)

}
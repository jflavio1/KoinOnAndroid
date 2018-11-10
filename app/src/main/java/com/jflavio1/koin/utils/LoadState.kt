package com.jflavio1.koin.utils

/**
 * LoadState
 *
 * LoadState is a class that will clarify the loading state of a process invoked
 * from a ViewModel. For example, when uploading an image, sending a task to the server,
 * wait for a response from server, etc.
 *
 * @param state will indicate the state given by a [Companion] value.
 * @param exception will indicate the exception that cause the load stops, this
 *                  means, if the state was [Companion.STATE_ERROR].
 * @param obj could be any object that will give extra information about the
 *            process. For example, if state stops as successful for a upload
 *            task, the [obj] could be the file url.
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  3/8/17
 */
class LoadState(val state: Int, val exception: Exception?, val obj: Any?) {

    constructor(state: Int) : this(state, null, null)

    constructor(state: Int, obj: Any?) : this(state, null, obj)

    constructor(state: Int, exception: Exception?) : this(state, exception, null)

    companion object {
        const val STATE_LOADING = 1
        const val STATE_SUCCESS = 2
        const val STATE_ERROR = 3

        fun load() = LoadState(LoadState.STATE_LOADING)

        fun success() = LoadState(LoadState.STATE_SUCCESS)

        fun <T> success(obj: T) = LoadState(LoadState.STATE_SUCCESS, obj)

        fun error(exception: Exception?) = LoadState(LoadState.STATE_ERROR, exception)

        fun <T> error(exception: Exception?, obj: T) = LoadState(LoadState.STATE_ERROR, exception, obj)

    }

}
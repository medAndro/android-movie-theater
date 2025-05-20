package woowacourse.movie.view.main.home.adapter

import woowacourse.movie.model.movie.Movie

fun interface MovieReservationListener {
    fun onReservationClick(movie: Movie)
}

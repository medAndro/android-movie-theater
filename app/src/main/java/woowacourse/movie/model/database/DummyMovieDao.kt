package woowacourse.movie.model.database

import woowacourse.movie.model.movie.Movie
import woowacourse.movie.model.theater.Theater
import java.time.LocalDate
import java.time.LocalDateTime

object DummyMovieDao : MovieDao {
    private val movieDao = FileBasedMovieDao(DummyMovieDB)

    override fun getTheaterNames(): List<String> = movieDao.getTheaterNames()

    override fun getShowingMovies(now: LocalDateTime): List<Movie> = movieDao.getShowingMovies(now)

    override fun getTimeTable(
        now: LocalDateTime,
        selectedDate: LocalDate,
        screenTimes: List<Int>,
    ): List<Int> = movieDao.getTimeTable(now, selectedDate, screenTimes)

    override fun getTotalTimeSlotCount(
        theater: Theater,
        now: LocalDateTime,
    ): Int = movieDao.getTotalTimeSlotCount(theater, now)

    override fun getMovies(theaterName: String): List<Movie> = movieDao.getMovies(theaterName)

    override fun getScreenTimes(
        theaterName: String,
        movieName: String,
    ): List<Int> = movieDao.getScreenTimes(theaterName, movieName)
}

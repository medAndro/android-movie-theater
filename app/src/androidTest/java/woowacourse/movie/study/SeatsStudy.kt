package woowacourse.movie.study

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import woowacourse.movie.model.seat.Seat
import woowacourse.movie.model.seat.Seats
import woowacourse.movie.model.seat.index.Col
import woowacourse.movie.model.seat.index.Row

@Suppress("ktlint:standard:function-naming")
class SeatsStudy {
    @Test
    fun mutableSet_clear_실험() {
        val mutableSet: MutableSet<Seat> = mutableSetOf()
        val seats = Seats(mutableSet)

        seats.add(Row(1), Col(3))
        assertThat(seats.size).isEqualTo(1)
        mutableSet.clear()
        assertThat(seats.size).isEqualTo(0)
    }
}

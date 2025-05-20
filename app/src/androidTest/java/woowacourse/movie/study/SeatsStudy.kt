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
    fun Seats_내부_컬렉션_수정_불가() {
        val emptySeatSet: Set<Seat> = setOf()
        val seats = Seats.create(emptySeatSet)

        seats.add(Row(1), Col(3))
        assertThat(seats.size).isEqualTo(1)
    }
}

package woowacourse.movie.view.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import woowacourse.movie.databinding.ItemMovieBinding
import woowacourse.movie.model.movie.Movie

class MovieViewHolder(
    private val binding: ItemMovieBinding,
    private val clickListener: MovieReservationListener,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: Movie) {
        binding.movie = movie
        binding.movieReservationListener = clickListener
    }

    companion object {
        fun from(
            parent: ViewGroup,
            clickListener: MovieReservationListener,
        ): MovieViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemMovieBinding.inflate(layoutInflater, parent, false)
            return MovieViewHolder(binding, clickListener)
        }
    }
}

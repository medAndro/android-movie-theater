package woowacourse.movie.view.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("imageResource")
fun setImageResource(
    imageView: ImageView,
    resId: Int,
) {
    imageView.setImageResource(resId)
}

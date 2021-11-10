package yayasan.idn.portofolio.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import yayasan.idn.portofolio.data.Portofolio

@BindingAdapter("androidTitle")
fun TextView.setTitleAndroid(data: Portofolio?) {
    data?.let {
        text = it.title
    }
}

@BindingAdapter("androidImage")
fun ImageView.setAndroidImage(data: Portofolio) {
    this.setImageResource(data.image)
}
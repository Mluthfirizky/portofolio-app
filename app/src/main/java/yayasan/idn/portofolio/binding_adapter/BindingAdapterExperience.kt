package yayasan.idn.portofolio.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import yayasan.idn.portofolio.data.Portofolio

@BindingAdapter("experienceTitle")
fun TextView.setExperienceTitle(data: Portofolio?) {
    data?.let {
        text = it.title
    }
}

@BindingAdapter("experienceDetail")
fun TextView.setExperienceDetail(data: Portofolio?) {
    data?.let {
        text = it.title
    }
}

@BindingAdapter("experienceImage")
fun ImageView.setExperienceImage(data: Portofolio) {
    load(data.image){
        crossfade(1000)
    }
}
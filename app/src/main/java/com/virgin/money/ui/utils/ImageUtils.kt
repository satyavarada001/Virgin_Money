package com.virgin.money.ui.utils

import android.annotation.SuppressLint
import android.content.Context
import android.widget.ImageView
import com.squareup.picasso.BuildConfig
import com.squareup.picasso.Picasso

object ImageUtils {

    @SuppressLint("StaticFieldLeak")
    lateinit var picasso: Picasso

    fun init(appContext: Context) {
        picasso = Picasso.Builder(appContext)
            .loggingEnabled(BuildConfig.DEBUG)
            .build()
    }

    fun loadFromUrl(imgUrl: String?, imgView: ImageView) {
        picasso.load(imgUrl).into(imgView)
    }
}

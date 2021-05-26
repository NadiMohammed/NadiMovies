package com.nadi.data.di

import android.annotation.SuppressLint
import android.content.Context


@SuppressLint("StaticFieldLeak")
internal lateinit var Context: Context

object DataDependencies {
    fun injectContext(context: Context) {
        Context = context
    }
}
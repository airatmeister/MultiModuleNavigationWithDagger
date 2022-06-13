package com.example.notifications.presentation.model

import android.widget.TextView

interface Notifications {

    fun apply(textView: TextView)

    class Base(private val text: String): Notifications {

        override fun apply(textView: TextView) {
            textView.text = text
        }

    }
}
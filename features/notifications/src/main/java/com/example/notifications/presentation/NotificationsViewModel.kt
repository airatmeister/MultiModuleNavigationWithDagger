package com.example.notifications.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.multimodulenavigationwithdagger.core.presentation.base.BaseViewModel
import javax.inject.Inject

class NotificationsViewModel @Inject constructor() : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
}
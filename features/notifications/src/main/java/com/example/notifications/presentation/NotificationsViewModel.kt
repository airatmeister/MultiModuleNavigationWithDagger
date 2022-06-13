package com.example.notifications.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.notifications.presentation.model.Notifications
import com.multimodulenavigationwithdagger.core.presentation.base.BaseViewModel
import javax.inject.Inject

class NotificationsViewModel @Inject constructor() : BaseViewModel() {

    private val _text = MutableLiveData<Notifications>().apply {
        value = Notifications.Base("This is notifications Fragment")
    }
    val text: LiveData<Notifications> = _text
}
package com.example.home.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.home.presentation.model.Home
import com.multimodulenavigationwithdagger.core.presentation.base.BaseViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor() : BaseViewModel() {

    private val _text = MutableLiveData<Home>().apply {
        value = Home.Base("This is home Fragment")
    }
    val text: LiveData<Home> = _text
}
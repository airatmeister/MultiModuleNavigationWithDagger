package com.example.dashboard.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dashboard.presentation.model.Dashboard
import com.multimodulenavigationwithdagger.core.presentation.base.BaseViewModel
import javax.inject.Inject

class DashboardViewModel @Inject constructor(): BaseViewModel() {

    private val _text = MutableLiveData<Dashboard>().apply {
        value = Dashboard.Base("This is dashboard Fragment")
    }
    val text: LiveData<Dashboard> = _text
}
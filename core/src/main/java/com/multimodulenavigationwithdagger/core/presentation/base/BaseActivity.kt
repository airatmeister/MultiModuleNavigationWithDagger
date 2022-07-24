package com.multimodulenavigationwithdagger.core.presentation.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.viewbinding.ViewBinding
import com.multimodulenavigationwithdagger.core.presentation.Navigator
import dagger.android.AndroidInjection
import com.multimodulenavigationwithdagger.core.presentation.UiAction
import javax.inject.Inject

abstract class BaseActivity<VB: ViewBinding> : AppCompatActivity, Navigator {

    constructor() : super()
    constructor(@LayoutRes layoutRes: Int) : super(layoutRes)

    lateinit var binding: VB
    protected abstract fun initVB() : VB

    protected lateinit var navigator: NavController
    abstract override fun getNavController(): NavController
    abstract override fun navigateTo(action: UiAction)

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    fun navigateTo(action: String, bundle: Bundle? = null){
        navigateTo(UiAction(action, bundle))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        binding = initVB()
        setContentView(binding.root)
    }

    abstract fun onSetupLayout()

    override fun onStart() {
        super.onStart()
        navigator = getNavController()
        onSetupLayout()
    }
}

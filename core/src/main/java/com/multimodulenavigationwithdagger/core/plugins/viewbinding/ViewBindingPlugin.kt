package com.multimodulenavigationwithdagger.core.plugins.viewbinding

import com.multimodulenavigationwithdagger.core.plugins.BasePlugin
import com.multimodulenavigationwithdagger.core.plugins.LifecycleEvent

/**
 * Помогает чистить биндинг при уничтодении вью фрагмента.
 *
 * Файл содердит все экстеншены, необходимые для работы с биндингом.
 * Пример использования:
 *
 * private val binding by viewBinding(FragmentTestBinding::bind)
 */
class ViewBindingPlugin : BasePlugin {

    private val clearListeners: MutableList<ClearBinding> = mutableListOf()

    fun addClearListener(listener: ClearBinding) {
        clearListeners.add(listener)
    }

    override fun onLifecycleEvent(event: LifecycleEvent) {
        when (event) {
            is LifecycleEvent.OnDestroyView -> {
                clearListeners.forEach { it.clear() }
                clearListeners.clear()
            }
            else -> Unit
        }
    }

    interface ClearBinding {
        fun clear()
    }
}

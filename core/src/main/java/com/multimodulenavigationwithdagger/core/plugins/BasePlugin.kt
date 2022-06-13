package com.multimodulenavigationwithdagger.core.plugins

/** Механизм плагинов.
 * Плагины - классы, которые завязаны на ЖЦ фрагмента.
 * Плагин получает событие об интересуемом его событии и делает некую логику, которую должен реализовать программист
 */
interface BasePlugin {
    fun onLifecycleEvent(event: LifecycleEvent)
}

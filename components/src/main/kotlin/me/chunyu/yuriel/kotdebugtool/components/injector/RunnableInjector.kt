package me.chunyu.yuriel.kotdebugtool.components.injector

import java.util.*

/**
 * Created by yuriel on 8/15/16.
 */
internal object RunnableInjector: Injectable<Runnable> {

    override val model: LinkedHashMap<String, Runnable> = LinkedHashMap()

    override fun add(name: String, t: Runnable) {
        model.put(name, t)
    }

    override fun run(t: Runnable?) {
        t?.run()
    }

    override fun get(name: String): Runnable? = model[name]

    override fun run(name: String) {
        run(this[name])
    }
}
package me.chunyu.yuriel.kotdebugtool.core

import android.content.Context

/**
 * Created by yuriel on 8/8/16.
 */
interface OnBlockEventInterceptor {
    fun onBlockEvent(context: Context, timeStart: String)
}

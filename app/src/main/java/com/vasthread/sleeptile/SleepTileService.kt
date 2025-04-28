package com.vasthread.sleeptile

import android.service.quicksettings.TileService

class SleepTileService : TileService() {

    override fun onClick() {
        super.onClick()
        runCatching {
            val process = Runtime.getRuntime().exec("su")
            process.outputStream.use {
                it.write("input keyevent 26\n".toByteArray())
                it.write("exit\n".toByteArray())
            }
            process.waitFor()
        }
    }
}
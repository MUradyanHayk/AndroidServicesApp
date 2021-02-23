package com.example.serviceactivity

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {
    companion object {
        const val TAG = ".MyService"
    }
    override fun onCreate() {
        super.onCreate()
        Log.i(TAG,"onCreate()")
    }

    override fun onBind(intent: Intent?): IBinder? {
        Log.i(TAG,"onBind()")
        return null
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.i(TAG,"onUnbind()")
        return super.onUnbind(intent)
    }

    override fun onRebind(intent: Intent?) {
        Log.i(TAG,"onRebind()")
        super.onRebind(intent)
    }

    override fun onDestroy() {
        Log.i(TAG,"onDestroy()")
        super.onDestroy()
    }
}
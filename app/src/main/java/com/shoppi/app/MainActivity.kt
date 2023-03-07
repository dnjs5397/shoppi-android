package com.shoppi.app

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        Log.d("abc", "onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("abc", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("abc", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("abc", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("abc", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("abc", "onDestroy")
    }
}
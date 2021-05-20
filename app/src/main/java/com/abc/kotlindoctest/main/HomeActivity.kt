package com.abc.kotlindoctest.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.abc.kotlindoctest.R

/**
 * This is only activity documentation
 */
class HomeActivity : AppCompatActivity(){

    /**
     * This is overrided on create methode
     * @param savedInstanceState
     * this is
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * this is just dummy methode description
     */
    fun testMethode(){
        Log.d("HomeActivity","testMethode")
    }

}
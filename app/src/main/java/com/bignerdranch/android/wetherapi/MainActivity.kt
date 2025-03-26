package com.bignerdranch.android.wetherapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.wetherapi.Fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()
    }
}
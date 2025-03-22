package com.bignerdranch.android.wetherapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bignerdranch.android.wetherapi.Fragments.MainFragment
import com.bignerdranch.android.wetherapi.databinding.ActivityMainBinding
import org.json.JSONObject

const val API_KEY = "705bc494d10c4699911154110252203"
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
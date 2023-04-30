package com.punyacile.androidpermission

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.punyacile.androidpermission.R
import com.punyacile.androidpermission.databinding.ActivityMain2Binding

class Main2Activity : AppCompatActivity() {


    lateinit var wifiManager:WifiManager
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "KotlinApp"

        wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager


        binding.button.setOnClickListener {
            enableWifi()
        }
        binding.button2.setOnClickListener {
            disableWifi()
        }
    }

    private fun enableWifi() {
        wifiManager.isWifiEnabled = true
        Toast.makeText(this, "Wifi enabled", Toast.LENGTH_SHORT).show()
    }
    private fun disableWifi() {
        wifiManager.isWifiEnabled = false
        Toast.makeText(this, "Wifi disabled", Toast.LENGTH_SHORT).show()
    }

}


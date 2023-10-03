package com.example.tutorial08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val settingsFragment = SettingsFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button:Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)

        button.setOnClickListener {
            loadHome()
        }
        button2.setOnClickListener {
            loadSettings()
        }

    }

    private fun loadHome(){
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (fragment == null){

            supportFragmentManager.beginTransaction().add(R.id.fragmentContainer,homeFragment).commit()
        }else{

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,homeFragment).commit()
        }
    }

    private fun loadSettings(){
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (fragment == null){

            supportFragmentManager.beginTransaction().add(R.id.fragmentContainer,settingsFragment).commit()
        }else{

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,settingsFragment).commit()
        }
    }



}
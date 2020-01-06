package com.kmanolopoulos.kbattleship.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kmanolopoulos.kbattleship.R
import com.kmanolopoulos.kbattleship.findopponent.FindOpponentActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        listOf<View>(
            btn_find_opponent,
            btn_statistics,
            btn_about,
            btn_exit
        ).forEach {
            it.setOnClickListener { onChoice(it) }
        }
    }

    private fun onChoice(view: View) {
        when (view) {
            btn_find_opponent -> startActivity(Intent(this, FindOpponentActivity::class.java))
            btn_statistics -> {
            }
            btn_about -> {
            }
            btn_exit -> exitProcess(0)
        }
    }
}

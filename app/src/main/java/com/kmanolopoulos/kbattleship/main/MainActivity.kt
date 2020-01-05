package com.kmanolopoulos.kbattleship.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.kmanolopoulos.kbattleship.R
import com.kmanolopoulos.kbattleship.board.BoardActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        btn_find_opponent.setOnClickListener { onChoice(it) }
    }

    private fun onChoice(view: View) {
        when (view) {
            btn_find_opponent -> {
            }
            btn_statistics -> {
            }
            btn_about -> {

            }
        }
    }
}

package com.kmanolopoulos.kbattleship.findopponent

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kmanolopoulos.kbattleship.R
import kotlinx.android.synthetic.main.activity_find_opponent.*

class FindOpponentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_opponent)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        refreshUiStatus(FindOpponentStatus.STATUS_INITIAL)
    }

    private fun refreshUiStatus(newStatus: FindOpponentStatus) = when (newStatus) {
        FindOpponentStatus.STATUS_INITIAL -> {
            btn_find_opponent.setOnClickListener { onFindOpponent() }
            bar_find_opponent.visibility = View.GONE
            spn_select_opponent.visibility = View.GONE
            btn_select_opponent.visibility = View.GONE
            btn_select_opponent.setOnClickListener(null)
        }
        FindOpponentStatus.STATUS_SEARCHING -> {
            btn_find_opponent.setOnClickListener(null)
            bar_find_opponent.visibility = View.VISIBLE
            spn_select_opponent.visibility = View.GONE
            btn_select_opponent.visibility = View.GONE
            btn_select_opponent.setOnClickListener(null)
        }
        FindOpponentStatus.STATUS_FOUND_ENTRIES -> {
            btn_find_opponent.setOnClickListener { onFindOpponent() }
            bar_find_opponent.visibility = View.GONE
            spn_select_opponent.visibility = View.VISIBLE
            btn_select_opponent.visibility = View.VISIBLE
            btn_select_opponent.setOnClickListener { onSelectOpponent() }
        }
        FindOpponentStatus.STATUS_CONNECTING -> {
            btn_find_opponent.setOnClickListener(null)
            bar_find_opponent.visibility = View.VISIBLE
            spn_select_opponent.visibility = View.VISIBLE
            btn_select_opponent.visibility = View.VISIBLE
            btn_select_opponent.setOnClickListener(null)
        }
    }

    private fun onFindOpponent() {
        refreshUiStatus(FindOpponentStatus.STATUS_SEARCHING)

        // TODO: Search for Bluetooth devices

        // TODO: If entries found then STATUS_FOUND_ENTRIES
        refreshUiStatus(FindOpponentStatus.STATUS_FOUND_ENTRIES)

        // TODO: If no entries found then STATUS_INITIAL
        //refreshUiStatus(FindOpponentStatus.STATUS_INITIAL)

    }

    private fun onSelectOpponent() {
        refreshUiStatus(FindOpponentStatus.STATUS_CONNECTING)

        // TODO: Try to connect with remote Bluetooth device

        // TODO: If connected then call next Activity

        // TODO: If not connected then STATUS_INITIAL
        refreshUiStatus(FindOpponentStatus.STATUS_INITIAL)
    }
}

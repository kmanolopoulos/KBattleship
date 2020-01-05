package com.kmanolopoulos.kbattleship.board

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.kmanolopoulos.kbattleship.R
import kotlinx.android.synthetic.main.activity_board.*

class BoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        val player1Board = BoardClass()
        val player2Board = BoardClass()

        rec_player1.layoutManager = GridLayoutManager(this, BoardClass.BOARD_SIZE)
        rec_player1.adapter = BoardAdapter(player1Board)

        rec_player2.layoutManager = GridLayoutManager(this, BoardClass.BOARD_SIZE)
        rec_player2.adapter = BoardAdapter(player2Board)
    }

}

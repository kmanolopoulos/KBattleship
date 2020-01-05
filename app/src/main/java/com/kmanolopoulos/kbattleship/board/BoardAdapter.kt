package com.kmanolopoulos.kbattleship.board

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kmanolopoulos.kbattleship.R

class BoardAdapter(val playerBoard: BoardClass) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.holder_board, parent, false)

        return BoardHolder(view)
    }

    override fun getItemCount(): Int {
        return BoardClass.BOARD_SIZE
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val obj = playerBoard.getState(
            position / BoardClass.BOARD_SIZE_X,
            position % BoardClass.BOARD_SIZE_Y
        )

        when (obj) {
            BoardStates.EMPTY_CLEAN_STATE -> (holder as BoardHolder).imageBoard.setImageResource(
                R.drawable.empty_clean_place
            )
            else -> (holder as BoardHolder).imageBoard.setImageResource(
                R.drawable.empty_clean_place
            )
        }
    }

}
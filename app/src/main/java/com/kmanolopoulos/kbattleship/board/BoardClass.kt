package com.kmanolopoulos.kbattleship.board

class BoardClass {
    private var state: Array<BoardStates> =
        Array(BOARD_SIZE) { BoardStates.EMPTY_CLEAN_STATE }

    fun getState(x: Int, y: Int): BoardStates {
        if ((x !in 0..BOARD_SIZE_X) || (y !in 0..BOARD_SIZE_Y)) {
            return BoardStates.INVALID_STATE
        }

        return state[x * BOARD_SIZE_X + y]
    }

    fun setState(x: Int, y: Int, newState: BoardStates): Boolean {
        if ((x !in 0..BOARD_SIZE_X) || (y !in 0..BOARD_SIZE_Y)) {
            return false
        }

        state[x * BOARD_SIZE_X + y] = newState

        return true
    }

    companion object {
        const val BOARD_SIZE_X = 10
        const val BOARD_SIZE_Y = 10
        const val BOARD_SIZE = BOARD_SIZE_X * BOARD_SIZE_Y
    }
}
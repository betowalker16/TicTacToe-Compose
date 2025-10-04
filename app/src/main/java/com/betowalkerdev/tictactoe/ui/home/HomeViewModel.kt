package com.betowalkerdev.tictactoe.ui.home

import androidx.lifecycle.ViewModel
import com.betowalkerdev.tictactoe.data.remote.FirebaseService
import com.betowalkerdev.tictactoe.data.remote.entities.GameData
import com.betowalkerdev.tictactoe.data.remote.entities.PlayerData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val firebaseService: FirebaseService
) : ViewModel() {

    fun onCreateGame(navigateToGame: (String, String, Boolean) -> Unit) {
        val game = createNewGame()
        val gameId = firebaseService.createGame(game)
        val userId = game.player1?.userId.orEmpty()
        val owner = true
        navigateToGame(gameId, userId, owner)
    }

    fun onJoinGame(gameId: String, navigateToGame: (String, String, Boolean) -> Unit) {
        val owner = false
        navigateToGame(gameId, createUserId() , owner)
    }

    private fun createUserId(): String {
        return java.util.UUID.randomUUID().toString()
    }

    private fun createNewGame(): GameData {
        val currentPlayer = PlayerData(playerType = 1)
        return GameData(
            board = List(9) { 0 },
            player1 = currentPlayer,
            playerTurn = currentPlayer,
            player2 = null
        )
    }
}
package com.betowalkerdev.tictactoe.data.remote.entities

import com.betowalkerdev.tictactoe.ui.model.GameModel
import com.betowalkerdev.tictactoe.ui.model.PlayerModel
import com.betowalkerdev.tictactoe.ui.model.PlayerType
import java.util.UUID

data class GameData(
    val board: List<Int>? = null,
    val gameId: String? = "",
    val player1: PlayerData? = null,
    val player2: PlayerData? = null,
    val playerTurn: PlayerData? = null
) {
    fun toModel(): GameModel {
        return GameModel(
            board = board?.map { PlayerType.getPlayerById(it) } ?: mutableListOf(),
            gameId = gameId.orEmpty(),
            player1 = player1!!.toModel(),
            player2 = player2?.toModel(),
            playerTurn = playerTurn!!.toModel()
        )
    }
}

data class PlayerData(
    val userId: String? = UUID.randomUUID().toString(),
    val playerType: Int? = null
) {
    fun toModel(): PlayerModel {
        return PlayerModel(
            userId = userId!!,
            playerType = PlayerType.getPlayerById(playerType)
        )
    }
}
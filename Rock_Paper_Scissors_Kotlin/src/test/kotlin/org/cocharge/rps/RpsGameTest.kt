package org.cocharge.rps

import org.cocharge.utils.Constants
import org.cocharge.utils.GameResult
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class RpsGameTest {
    private val rpsGame = RpsGame()

    @Test
    fun testPlayGame() {
        val result = rpsGame.playGame()
        Assertions.assertNotNull(result)
    }

    @Test
    fun testGetGameFinalResult() {
        Assertions.assertEquals(GameResult.PLAYER_A_WIN, rpsGame.getGameFinalResult(Constants.ROCK, Constants.SCISSORS))
        Assertions.assertEquals(GameResult.PLAYER_B_WIN, rpsGame.getGameFinalResult(Constants.ROCK, Constants.PAPER))
        Assertions.assertEquals(GameResult.DRAW, rpsGame.getGameFinalResult(Constants.ROCK, Constants.ROCK))
    }
}
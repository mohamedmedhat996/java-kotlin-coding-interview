package org.cocharge.rps

import org.cocharge.utils.Constants
import org.cocharge.utils.GameResult
import org.cocharge.utils.Util

class RpsGame {

    fun playGame(): GameResult {
        val playerA = Constants.ROCK; // Always Play ROCK
        val playerB = Util.getRandomChoice();

        return getGameFinalResult(playerA, playerB);
    }

    public fun getGameFinalResult(playerA: String,playerB: String): GameResult {
        return when {
            (playerA.equals(playerB)) -> GameResult.DRAW

            (playerA.equals(Constants.ROCK) && playerB.equals(Constants.SCISSORS) ||
             playerA.equals(Constants.PAPER) && playerB.equals(Constants.ROCK) ||
             playerA.equals(Constants.SCISSORS) && playerB.equals(Constants.PAPER)) -> GameResult.PLAYER_A_WIN

            else -> GameResult.PLAYER_B_WIN
        }
    }
}
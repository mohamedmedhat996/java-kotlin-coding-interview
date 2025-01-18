package org.cocharge.rps;

import org.cocharge.utils.Constants;
import org.cocharge.utils.GameResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RpsGameTest {
    RpsGame rpsGame = new RpsGame();

    @Test
    void testPlayGame() {
        GameResult result = rpsGame.playGame();
        Assertions.assertNotNull(result);
    }

    @Test
    void testGetGameFinalResult() {
        Assertions.assertEquals(GameResult.PLAYER_A_WIN, rpsGame.getGameFinalResult(Constants.ROCK, Constants.SCISSORS));
        Assertions.assertEquals(GameResult.PLAYER_B_WIN, rpsGame.getGameFinalResult(Constants.ROCK, Constants.PAPER));
        Assertions.assertEquals(GameResult.DRAW, rpsGame.getGameFinalResult(Constants.ROCK, Constants.ROCK));
    }
}

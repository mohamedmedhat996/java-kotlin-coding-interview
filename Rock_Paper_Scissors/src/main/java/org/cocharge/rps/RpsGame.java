package org.cocharge.rps;

import org.cocharge.utils.Constants;
import org.cocharge.utils.GameResult;
import org.cocharge.utils.Util;

public class RpsGame {

    public GameResult playGame(){
        String playerA = Constants.ROCK; // Always choose rock as Requested
        String playerB = Util.getRandomChoice();

        return getGameFinalResult (playerA, playerB);
    }

    public GameResult getGameFinalResult(String playerA, String playerB){
        if (playerA.equals(playerB)){
            return  GameResult.DRAW;
        } else if ( playerA.equals(Constants.ROCK) && playerB.equals(Constants.SCISSORS) ||
                    playerA.equals(Constants.PAPER) && playerB.equals(Constants.ROCK) ||
                    playerA.equals(Constants.SCISSORS) && playerB.equals(Constants.PAPER) ){
            return  GameResult.PLAYER_A_WIN;
        } else {
            return GameResult.PLAYER_B_WIN;
        }
    }
}

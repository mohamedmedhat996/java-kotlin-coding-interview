package org.cocharge;

import org.cocharge.rps.RpsGame;
import org.cocharge.utils.GameResult;

public class Main {
    public static void main(String[] args) {
        RpsGame rpsGame = new RpsGame();
        int playerAWinCount = 0;
        int playerBWinCount = 0;
        int drawCount = 0;

        for (int i=0; i< 100; i++){
            GameResult result = rpsGame.playGame();
            switch (result){
                case DRAW -> drawCount++;
                case PLAYER_A_WIN -> playerAWinCount++;
                case PLAYER_B_WIN -> playerBWinCount++;
            }
        }

        System.out.println("Player A wins " + playerAWinCount + " of 100 games");
        System.out.println("Player B wins " + playerBWinCount + " of 100 games");
        System.out.println("Draws: " + drawCount + " of 100 games");
    }
}
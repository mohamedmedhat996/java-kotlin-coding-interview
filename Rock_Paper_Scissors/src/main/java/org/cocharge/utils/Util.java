package org.cocharge.utils;

import java.util.Random;

public class Util {
    private static final Random random = new Random();

    public static String getRandomChoice(){
        int choice = random.nextInt(3);
        switch (choice){
            case 0 -> {
                return Constants.ROCK;
            }
            case 1 -> {
                return Constants.PAPER;
            }
            case 2 -> {
                return Constants.SCISSORS;
            }
        }
        return null;
    }
}

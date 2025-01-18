package org.cocharge.utils

import kotlin.random.Random

class Util {
    companion object {
         fun getRandomChoice(): String {
            return when (Random.nextInt(3)) {
                0 -> Constants.ROCK;
                1 -> Constants.PAPER;
                2 -> Constants.SCISSORS;
                else -> "";
            }
        }
    }
}
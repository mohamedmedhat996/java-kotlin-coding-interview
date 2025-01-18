import org.cocharge.rps.RpsGame
import org.cocharge.utils.GameResult

fun main(args: Array<String>) {
    val rpsGame = RpsGame()
    var playerAWinsCount = 0
    var playerBWinsCount = 0
    var drawsCount = 0

    repeat(100) {
        when (rpsGame.playGame()) {
            GameResult.PLAYER_A_WIN -> playerAWinsCount++
            GameResult.PLAYER_B_WIN -> playerBWinsCount++
            GameResult.DRAW -> drawsCount++
        }
    }

    println("Player A wins $playerAWinsCount of 100 games")
    println("Player B wins $playerBWinsCount of 100 games")
    println("Draws: $drawsCount of 100 games")
}
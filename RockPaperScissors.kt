import kotlin.random.Random

fun main() {
    val options = listOf("rock", "paper", "scissors")
    
    println("Welcome to Rock-Paper-Scissors game!")
    
    while (true) {
        println("Enter your choice (rock, paper, or scissors): ")
        val playerChoice = readLine()?.toLowerCase()
        
        if (playerChoice !in options) {
            println("Invalid choice. Please choose from rock, paper, or scissors.")
            continue
        }
        
        val computerChoice = options[Random.nextInt(options.size)]
        
        println("Computer chose: $computerChoice")
        println("You chose: $playerChoice")
        
        when {
            playerChoice == computerChoice -> println("It's a tie!")
            playerChoice == "rock" && computerChoice == "scissors" ||
            playerChoice == "paper" && computerChoice == "rock" ||
            playerChoice == "scissors" && computerChoice == "paper" -> {
                println("You win!")
            }
            else -> println("Computer wins!")
        }
        
        println("Do you want to play again? (yes/no): ")
        val playAgain = readLine()?.toLowerCase()
        if (playAgain != "yes") {
            println("Thanks for playing!")
            break
        }
    }
}

/*
Problem Statement:
Write a Kotlin program to count the occurrences of each word in a given input text.
The program should prompt the user to enter a paragraph or multiple lines of text.
After receiving the input, the program should process the text and display a list of unique words
along with their corresponding counts, sorted in descending order based on the word frequency.
Additionally, the program should show the total count of all words in the input.

Example:
Input:
"This is a simple example. This is a sample text for word counting example."

Output:
Word Count
is    2
example    2
This    2
a    1
counting    1
for    1
sample    1
simple    1
text    1
word    1

Total Words: 11
*/

fun main() {
    // Prompt the user to enter the text
    println("Enter a paragraph or multiple lines of text:")
    val inputText = readLine()

    // Check if the input is not empty
    if (!inputText.isNullOrBlank()) {
        // Remove any punctuation marks and convert the text to lowercase for consistency
        val sanitizedText = inputText.replace(Regex("[^A-Za-z0-9\\s]"), "").lowercase()

        // Split the text into words using whitespace as a delimiter
        val words = sanitizedText.split("\\s+".toRegex())

        // Count the occurrences of each word using a HashMap
        val wordCountMap = HashMap<String, Int>()
        for (word in words) {
            wordCountMap[word] = wordCountMap.getOrDefault(word, 0) + 1
        }

        // Sort the wordCountMap based on word frequency (descending order)
        val sortedWordCount = wordCountMap.toList().sortedByDescending { (_, count) -> count }

        // Display the results
        println("Word Count")
        for ((word, count) in sortedWordCount) {
            println("$word    $count")
        }

        // Calculate and display the total word count
        val totalWords = words.size
        println("\nTotal Words: $totalWords")
    } else {
        println("No input text provided.")
    }
}

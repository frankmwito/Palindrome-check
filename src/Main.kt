import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var tempNumber = number
    var palindrome = 0
    try {
        while (tempNumber != 0) {
            val digit = tempNumber % 10
            palindrome = palindrome * 10 + digit
            tempNumber /= 10
        }
    }
    catch (e: Exception){
        println(e.message)
    }
    if (number == palindrome)
    {
        println("The number is palindrome $palindrome")
    }
    else {
        println("The number is not a palindrome $palindrome")
    }
}
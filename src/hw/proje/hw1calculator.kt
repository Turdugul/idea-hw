package hw.proje

fun main(){
    println("enter the first number")
    val a1 = readLine().parseToInt()
    println("enter operation sign:")
    val symbols = readLine()
    println("enter the second number: ")
    val a2 = readLine().parseToInt()
    when(symbols) {
        "+" -> print(a1 + a2)
        "-" -> print(a1 - a2)
        "*" -> print(a1 * a2)
        "/" -> println(div(a1 , a2))
        else -> {
            println("Definitely enter the sign!")
        }
    }
}
private fun div(a1: Int, a2: Int): String {
    return try {
        "result= ${a1 / a2}"
    } catch (e: ArithmeticException) {
        "Cannot be divided by 0!!!"
    }
}

private fun String?.parseToInt(): Int {
    if (this == "") return 0
    if (this == null) return 0

    try {
        return this.toInt()
    } catch (e: NumberFormatException) {
        return 0
        println("enter only a number")
    }
}
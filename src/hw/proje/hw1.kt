package hw.proje

import java.util.*

//Okonbaeva Turdugul 5/homework


fun main() {
    val map = hashMapOf(
        "Aya" to 777888999, "Maya" to 777444555, "Rose" to 777666111
    )
    println("Введите кол-во записей: ")
    val kolZapisi = readLine().parseToInt()
    val iterator = (1..kolZapisi).iterator()
    iterator.forEach {
        val read = Scanner(System.`in`)
        println("Введите имя и номер: ")
        val name = read.next()
        val phone = read.nextInt()
        map[name] = phone
        println(map)

    }
    do {
        println("Введите имя: ")
        val key = readLine()

        if (key in map.keys) {
            println("$key = ${map[key]}")
        } else {
            println("Не найдено")
        }
    } while (key != "exit")
    }
 private fun String?. parseToInt(): Int {
     if (this == null) return  0
     if (this == "") return  0

     return try {
         this.toInt()
     } catch (e: NumberFormatException){
         println("exception = $e")
         return 0
     }

 }

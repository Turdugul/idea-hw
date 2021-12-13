package hw.proje

fun main (){
        val arrays = intArrayOf(7, 5, 3, 9, 1, 88, 22, 15, 78, 188, 0)
        var temp: Int
        var sorted = false
        while (!sorted) {
            sorted = true
            for (i in 0 until arrays.size - 1) { // лишние обходы в конец отсортированной части
                if (arrays[i] > arrays[i + 1]) {
                    temp = arrays[i]
                    arrays[i] = arrays[i + 1]
                    arrays[i + 1] = temp
                    sorted = false
                }
            }
        }
        for (i in arrays) {
            println(i)
        }
    }


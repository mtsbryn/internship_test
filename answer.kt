fun main() {
    try {
        val input = readLine()

        if (input != null && input.isNotBlank()) { // nullかつ空白文字ではないことを判定
            val number = input.toInt()

            if (number != 0) {  // 0でないことを判定
                for (i in 1..number) {
                    for (j in 1..number - i) {
                        print(" ")
                    }
                    for (j in 1..i) {
                        print(j % 10)
                    }
                    for (j in i - 1 downTo 1) {
                        print(j % 10)
                    }
                    println()
                }
            } else {
                println("Error: 0 is not a valid input") // "0"が入力された場合のエラーメッセージ
            }
        } else {
            println("Error: Blanks and nulls are invalid") // "null"かつ"空白文字"が入力された場合のエラーメッセージ
        }
    } catch (e: NumberFormatException) {
        println("Error: Invalid input, not an integer") // その他、整数以外が入力された場合のエラーメッセージ
    }
}

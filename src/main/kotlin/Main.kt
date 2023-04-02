fun addTwoNumbers(a: Float, b: Float): Float {
    return a + b
}

fun subtractTwoNumbers(a: Float, b: Float): Float {
    return a - b
}

fun multiplyTwoNumbers(a: Float, b: Float): Float {
    return a * b
}

fun divideTwoNumbers(a: Float, b: Float): Float {
    return a / b
}

fun moduloTwoNumbers(a: Float, b: Float): Float {
    return a % b
}


fun main(args: Array<String>) {
    println("Calculator")
    while (true) {
        print("> ")
        var input = readlnOrNull()
        if (input != null) {
            var inputArray = input.split(" ")
            if (inputArray.size == 3) {
                var a = inputArray[0].toFloat()
                var b = inputArray[2].toFloat()
                var operator = inputArray[1]
                var result = 0f
                when (operator) {
                    "+" -> result = addTwoNumbers(a.toFloat(), b.toFloat()).toFloat()
                    "-" -> result = subtractTwoNumbers(a, b)
                    "*" -> result = multiplyTwoNumbers(a, b)
                    "/" -> result = divideTwoNumbers(a, b)
                    "%" -> result = moduloTwoNumbers(a, b)
                    else -> println("Invalid operator")
                }
                println("Result: $result")
            } else if (input == "exit") {
                println("exiting...")
                break
            } else {
                println("Invalid input")
            }
        }
    }

}
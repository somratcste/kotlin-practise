class Car {
    var brand = ""
    var model = ""
    var year = 0
}

fun main() {
    println("Hello World!");
    print("I am new in programming!");

    var name = "John"      // String (text)
    val birthyear = 1975   // Int (number)

    println(name)          // Print the value of name
    println(birthyear)     // Print the value of birthyear

    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"

    val x: Int = 5
    val y: Long = x.toLong()
    println(y)

    var firstName = "John"
    var lastName = "Doe"
    println("My name is $firstName $lastName")

    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])

    val cars2 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars2) {
        println(x)
    }

    for (nums in 5..15) {
        println(nums)
    }

    myFunction("nazmul");

    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969
}

fun myFunction(fname: String) {
    println(fname + " Doe")
}
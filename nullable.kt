import java.util.Calendar





fun main() {


//
//    println("Enter you name")
//    val name1= readln()
//
//    println("Please enter your name (or type 'null' to represent null value):")
//    val input = readLine()
//
//    val name: String? = if (input.equals("null", ignoreCase = true)) {
//        null
//    } else {
//        input
//    }
//
//    println("Name: $name1")
//
//    //these return value or string that are not and never nullabelle
//
//    var age: Int =Integer.valueOf(readLine())
//    println("Your name is $name and your age is $age")
//
//
//
//    // nullabe are declared with the ? on the string
////eg
//    var str1:String? ="Adam"
//    str1 = null
//    print(str1)
//
//    var num:Int? = 21
//     num = null
//    println("the valu of the nullable is $num")
//
//
//
////THE CONDITIONAL STATEMENTS IN KOTLIN
//    val rain = false
//    if(rain){
//        print("It didnt rain")
//    }
//    else{
//        println("when will it rain ")
//    }
//
//    println("Enter the year of birth:")
//    val yearbirth = readLine()?.toIntOrNull()
//
//    fun age(yearbirth: Int): Int {
//        val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
//        return currentYear - yearbirth
//    }
//
//    if (yearbirth != null) {
//        val calculatedAge = age(yearbirth)
//        println("Your age is $calculatedAge.")
//
//        // Example of using the result in an if statement
//        if (calculatedAge >= 18) {
//            println("You are an adult.")
//        } else {
//            println("You are a minor.")
//        }
//    } else {
//        println("Invalid input. Please enter a valid year of birth.")
//    }



        println("Enter your year you were born:")
        val year = readLine()?.toIntOrNull()

        if (year!= null) {
            when (year) {
                in 0..1995 -> println("Gen Z")
                in 1946..1964 -> println("Millennial")
                in 1960..1980 -> println("Gen X")
                else -> println("Baby Boomer")
            }
        } else {
            println("Invalid input. Please enter a valid year.")
        }


}
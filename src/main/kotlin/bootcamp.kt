//fun main(){
//    println("hey my dear")
//
//    var x =2
//    var y = 23
//
//    var z = if(x>y){
//        print("its mine  $y" )
//
//    }
//    else{
//        print("hello mine $x")
//
//    }
//
//    //write a program that calculate the difference the year you were born and the current year
//}
import java.util.Calendar
import kotlin.math.pow
import kotlin.math.sqrt

fun calculateAge(yearOfBirth: Int): Int {
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    return currentYear - yearOfBirth
}

fun main() {
    print("Enter the year you were born: ")
    try {
        val yearOfBirth = readLine()?.toInt()
        if (yearOfBirth != null) {
            val age = calculateAge(yearOfBirth)
            if (age >= 0) {
                println("You are $age years old.")
            } else {
                println("Invalid input. Please enter a valid year.")
            }
        } else {
            println("Invalid input. Please enter a valid year in numeric format.")
        }
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a valid year in numeric format.")
    }


    val base = 4.0
    val height = 3.0

    // Calculate the square of the base and height
    val baseSquared = base.pow(2)
    val heightSquared = height.pow(2)


    val hypotenuseSquared = baseSquared + heightSquared

    
    val hypotenuse = sqrt(hypotenuseSquared)

    println("The length of the hypotenuse is approximately %.2f cm".format(hypotenuse))
}

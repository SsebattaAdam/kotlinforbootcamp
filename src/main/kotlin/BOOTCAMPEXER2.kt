import kotlin.math.sqrt

fun main() {
    val a1 = 1.0
    val b1 = 10.0
    val c1 = 25.0

    val discriminant = b1 * b1 - 4 * a1 * c1

    if (discriminant >= 0) {
        val root1 = (-b1 + sqrt(discriminant)) / (2 * a1)
        val root2 = (-b1 - sqrt(discriminant)) / (2 * a1)
        println("Root 1: $root1")
        println("Root 2: $root2")
    } else {
        println("No real roots.")
    }

//number two


    val speed = 1000.0 // m/s
    val acceleration = 25.0 // m/s^2
    val distance = 5000.0 // meters

    val tim = speed / acceleration // time taken to reach the final speed
    val total_time = tim + sqrt((2 * distance) / acceleration) // total time taken (time to reach final speed + time to cover the distance)
    println("Time taken to move 5km: ${total_time} seconds")

//uumber three

    println("Choose one option: pizza, chicken, pancakes, cake")
    val choice = readLine()?.toLowerCase()

    // Using if statement
    if (choice == "pizza") {
        println("You selected Pizza Hut")
    } else if (choice == "chicken") {
        println("You selected KFC")
    } else if (choice == "pancakes") {
        println("You selected Foodhub")
    } else if (choice == "cake") {
        println("You selected Cakely")
    } else {
        println("Invalid choice")
    }

    // Using when statement
    when (choice) {
        "pizza" -> println("You selected Pizza Hut")
        "chicken" -> println("You selected KFC")
        "pancakes" -> println("You selected Foodhub")
        "cake" -> println("You selected Cakely")
        else -> println("Invalid choice")
    }


//number four

    val a = 1.0
    val b = 7.0
    val c = 10.0

    val discriminant2 = b * b - 4 * a * c

    if (discriminant2 >= 0) {
        val root1 = (-b + sqrt(discriminant2)) / (2 * a)
        val root2 = (-b - sqrt(discriminant2)) / (2 * a)
        val root3 = -b / a
        println("Root 1: $root1")
        println("Root 2: $root2")
        println("Root 3: $root3")
    } else {
        println("No real roots.")
    }


//number five

    val carSpeed = 20 // km/h

    println("Choose a route: route1, route2, route3, or another")
    val selectedRoute = readLine()

    val distanceCovered = when (selectedRoute) {
        "route1" -> 5000
        "route2" -> 25000
        "route3" -> 50000
        else -> 10000
    }

    val time = distanceCovered.toDouble() / carSpeed
    println("Distance covered: ${distanceCovered}km")
    println("Time taken: ${time} hours")

}

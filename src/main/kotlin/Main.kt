fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


//    val nums = listOf(1,2,3)
//    val result = nums.toMutableList().apply{add(4)}
//    println(result.joinToString(","))

//    val x = 5
//    val y =3
//    val max = if(x>y) x else y
//    print (max)

//    val nums = listOf(1,2,3)
//    val result = nums.fold(0){
//        acc, num->acc+num
//    }
//    print(result)
//    val nums = arrayOf(1,2,3,4,5)
//    val re = nums.map{it*it}.find { it>10 }
//    print(re)

//    val nums = mapOf(1 to "one",2 to "two", 3 to "three")
//    nums.forEach{println("${it.key} is ${it.value}")}

//    val arr = arrayOf(1,2,3,4,5)
//    val re = arr.map { it*2 }
//    println(re.joinToString (","))

//    val arr = arrayOf(1,2,3,4,5)
//    val re = arr.filter { it %2 == 0 }.take(2)
//    println(re.joinToString (","))

    val nums = listOf(1,2,3)
    val re = nums.fold(0){acc, num->acc+num}
    println(re)

}
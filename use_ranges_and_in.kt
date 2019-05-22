// See http://kotlinlang.org/docs/reference/ranges.html#ranges

fun main(args: Array<String>) {
    val x = args[0].toInt()
    // Check if a number lies within a range:
    val y = 10
    if (x in 1..y - 1){
        println("OK")
    }

    //Iterate over a range:
    for (a in 1..5) {
        print("${a} ")
    }

    // Check if a number is out of range:
    println()
    val array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")

    if (x !in 0..array.size - 1) {
        println("Out: array has only ${array.size} elements. x = ${x}")
    }
    
    //Check if a collection contains an object:
    if ("aaa" in array) // conllection.contains(obj) is called
        println("Yes: array contains aaa")

    if ("ddd" in array) // conllection.contains(obj) is called
        println("yes: array contains ddd")
    else 
        println("No: array doesn't contains ddd")
}
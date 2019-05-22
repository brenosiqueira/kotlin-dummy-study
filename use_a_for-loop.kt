// http://kotlinlang.org/docs/reference/control-flow.html#for-loops
fun main(args: Array<String>) {
    for (arg in args){
        println(arg)
    }
    // Or
    println()
    for (i in args.indices) {
        println(args[i])
    }
}
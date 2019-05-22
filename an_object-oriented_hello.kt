class Greeter(val name: String) {
    fun greet() {
        println("Helo, ${name}");
    }
}

fun main(args: Array<String>) {
    Greeter(args[0]).greet()
}
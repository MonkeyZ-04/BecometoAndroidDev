var nickname = "Nonnon"
var location = "88/165"
// Global variable

fun main(args: Array<String>) {
    var name: String = "Non"
    println(sayHello(name))
    sayGoodBye(name)
}

fun sayHello(name: String): String {
    var hello = "Hello $name"
    return hello
}

fun sayGoodBye(name: String) {
    println("$nickname Bye Bye ! $name")
}
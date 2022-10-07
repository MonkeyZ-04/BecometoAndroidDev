open class Animal():AnimalHanler{
    var name: String ?= null
    var color: String ?= null
    var weight: String ?= null

//    class Extension
//    fun String.sayHello(): String = "Hello " + this

    constructor(name : String, color: String, weight: String) : this() {
        this.name = name
        this.color = color
        this.weight = weight
        println("Hello ${this.name} Color : ${this.color}  weight : ${this.weight}")
    }

    override fun eat() {
        println("Ngum Ngum")
    }

    override fun sleep() {
        println("So sleepy")
    }
// Signature,Overload
//    constructor(name: String): this(){
//
//    }
}
import java.time.Year

fun main(args: Array<String>) {

    var car1 = Car("i Dang","A1234","Prame")
    var car2 = Car("Supercar007","B234","Non")
    var car3 = Car("NewCar","C434","Dog", Year.now())

    println(car1.owner)
    println(car2.owner)
    println(car3.owner)
}
fun main(args: Array<String>)
{
    var num1 = 10
    var num2:Double = 20.0
    var num3: Float = 23.5f
    println(num1*num2*num3)
    //4700.0
    println("Sum is "+(num1*num2*num3))
    //Sum is 4700.0
    println("Sum is ${num1*num2*num3}")
    //Sum is 4700.0
//    การคูณจะใช้ได้กับตัวเลขเท่านั้น ไม่สามารถคูณString แบบPython ได้
}
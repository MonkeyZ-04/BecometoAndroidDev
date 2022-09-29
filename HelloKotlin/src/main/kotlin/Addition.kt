fun main(args: Array<String>)
{
    var num1 = 10
    var num2:Double = 20.0
    var num3: Float = 23.5f
    println(num1+num2)
    println(num1+num3)
    println(num1+num2+num3)
//    ถ้าบวกกันตัวที่ออกมาก็จะเป็นตัวใหญ่สุด
    println("Sum is "+(num1+num2+num3))
    println("Sum is ${num1+num2+num3}")
}
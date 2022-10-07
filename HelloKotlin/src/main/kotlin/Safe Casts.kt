fun main(args: Array<String>){
    var number:Int? = 0
    var something:Any = 1
//    any = type อะไรก็ได้
    number = something as? Int
//    ถ้า Something มี Type เป็น int ก็จะเก็บค่าในตัวแปร number ได้
//    ถ้าไม่ตรงจะส่งค่า null กลับมา
//    var something:Any = "Hello"
    println(number)
}
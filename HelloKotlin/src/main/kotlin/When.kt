fun main(args: Array<String>){
    var number = 18
// ข้อมูลที่เข้ามาต้อวตรงกับเงื่อนไขของมันด้วย
    when(number){
        17 -> println("Too Low")
        18 -> {
            println("Yeah")
        }
        19 -> println("Too High")
        else -> println("Nothing")
    }
    //yeah
}
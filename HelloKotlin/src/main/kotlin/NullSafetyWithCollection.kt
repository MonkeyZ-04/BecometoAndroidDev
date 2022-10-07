fun main(args: Array<String>){
    val listWithNull: List<String?> = listOf("First", "Second", null)
    val listWithNotNull: List<String> = listWithNull.filterNotNull()
//    สามารถใช้แทน lsit อันบนได้เลย ไม่ต้องไปใช้let อีกรอบ
    for (item in listWithNull){
//        println(item?.length) ทำได้ถ้าไม่มี Null
        item?.let {println(item.length)}
//        ถ้าเป็น null จะไม่ทำงาน
    }


}
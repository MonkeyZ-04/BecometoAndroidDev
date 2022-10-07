import java.io.FileWriter

fun main(args: Array<String>){
    var writer = FileWriter("hello.txt")
    writer.write("Hello write file")
    writer.close()
//    ถ้าไม่ปิดไฟล์ โปรแกรมจะไม่เซฟไว้ให้
//    ถ้าปิดไฟล์ไปแล้วจะไม่สามารถเขียนต่อได้ ต้องไปเปิดก่อน
}
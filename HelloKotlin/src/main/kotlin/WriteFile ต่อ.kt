import java.io.FileWriter

fun main(args: Array<String>) {
    var writer = FileWriter("hello.txt",true)
    writer.write("Hello Lopbu\n")
    writer.close()
}
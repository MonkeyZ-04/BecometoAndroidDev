import java.io.FileReader
import java.io.FileWriter

var exit = false
fun main(args: Array<String>){

    do {
        println("")
        println("Hello What do you want?")
        println("1.Write file")
        println("2.Read file")
        println("3.Delete data")
        println("4.Exit")

        var number = readLine()
        when(number){
            "1" -> writeFile()
            "2" -> readFile()
            "3" -> clearData()
            "4" -> ExitExite()
        }
    }while (exit != true)
    println("Bye")
}

fun ExitExite() {
    exit = true
}

fun clearData() {
    try {
        var writer = FileWriter("hello.txt")
        writer.write("")
        writer.close()
    }catch (e: Exception){
        println("Error: $e")
    }finally {
        println("Delete Data Complete!!")
    }

}

fun writeFile(){
    println("Write Your message below here")
    var message = readLine()
    try {
        var writer = FileWriter("hello.txt",true)
        writer.write("$message\n")
        writer.close()
    }catch (e: Exception){
        println("Error: $e")
    }finally {
        println("Write File Complete!!")
    }
}

fun readFile(){
    var message: List<String>? = null
    try {
        var reader = FileReader("hello.txt")
        message = reader.readLines()
    }catch (e: Exception){
        println("Error : $e")
    }finally {
        print("Read File Complete:  ")
    }
    if (message != null) {
        for (line in message) {
            println(line)
        }
    }
}
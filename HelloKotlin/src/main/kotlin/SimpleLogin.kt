fun main(args: Array<String>){

    var isCorrect = false

    do {
        println("--- Login ---")
        println("--- Username : ")
        var userName = readLine()
        println("--- Password : ")
        var passWord = readLine()
        if (userName == "admin" && passWord == "1234"){
            isCorrect = true
        }
        else if (userName == "admin"){
            println("Password Wrong")
        }
        else if (passWord == "1234"){
            println("Username Wrong")
        }
        else{
            println("Wrong ! Please try again")
        }
    }while (isCorrect != true)
    println("Complete")
}
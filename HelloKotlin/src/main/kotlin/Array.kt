fun main(args: Array<String>) {
    var myarray = Array<String>(size = 4){"a"}
//    println(myarray[0])

    myarray[0] = "H"
    myarray[1] = "e"
    myarray[2] = "l"
    myarray[3] = "o"

//    for (line in myarray){
//        println(line)
//    }
    for (line in 0..myarray.size-1){
        println(myarray[line])
    }
}
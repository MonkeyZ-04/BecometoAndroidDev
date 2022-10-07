fun main(args: Array<String>){
    var myarraylist = ArrayList<String>()
    myarraylist.add("Non")
    myarraylist.add("MonkeyZ")
    myarraylist.add("Dog")

    println(myarraylist)

    myarraylist.remove("Dog")

    println(myarraylist)
    println(myarraylist.get(0))
    println(myarraylist[1])

    if (myarraylist.contains("Non")){
        println("So Handsome")
    }
}
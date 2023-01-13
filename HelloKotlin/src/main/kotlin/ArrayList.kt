fun main(args: Array<String>){
    var myarraylist = ArrayList<String>()
    myarraylist.add("Non")
    myarraylist.add("MonkeyZ")
    myarraylist.add("Dog")

    println(myarraylist)
    //[Non, MonkeyZ, Dog]

    myarraylist.remove("Dog")
    //[Non, MonkeyZ]

    println(myarraylist)
    println(myarraylist.get(0))
    //Non
    println(myarraylist[1])
    //MonkeyZ

    if (myarraylist.contains("Non")){
        println("So Handsome")
        //So Handsome
    }
}
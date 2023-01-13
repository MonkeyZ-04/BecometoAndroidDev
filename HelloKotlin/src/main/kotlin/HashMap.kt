fun main(args: Array<String>) {
    var myHashMap = HashMap<String,String>()
    myHashMap.put("handsome","Non")
    myHashMap.put("smart","Dog")
    myHashMap.put("cute","MonkeyZ")

    println(myHashMap.get("handsome"))
    //Non
    println(myHashMap["cute"])
    //MonkeyZ

    for (key in myHashMap.keys){
        println("key $key -> value: ${myHashMap[key]}")
        //key handsome -> value: Non
        //key cute -> value: MonkeyZ
        //key smart -> value: Dog
    }
    println(myHashMap.values)
    //[Non, MonkeyZ, Dog]
}
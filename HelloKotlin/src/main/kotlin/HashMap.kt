fun main(args: Array<String>) {
    var myHashMap = HashMap<String,String>()
    myHashMap.put("handsome","Non")
    myHashMap.put("smart","Dog")
    myHashMap.put("cute","MonkeyZ")

    println(myHashMap.get("handsome"))
    println(myHashMap["cute"])

    for (key in myHashMap.keys){
        println("key $key -> value: ${myHashMap[key]}")
    }
    println(myHashMap.values)
}
import java.time.Year

class Car(name: String, seriaNumber: String, owner:String){
    var name: String ?= null
    var seriaNumber: String ?= null
    var owner: String
        get() = this.toString()
        set(value) {
            this.owner = value
        }
//    ทำได้เหมือนกัน
    var year: Year ?= null
constructor(name: String , seriaNumber: String, owner:String, year: Year) : this(name,seriaNumber,owner){
    this.year = year
}

//    Constructor
    init {
        this.name = name
        this.seriaNumber = seriaNumber
        this.owner = owner
    }
}
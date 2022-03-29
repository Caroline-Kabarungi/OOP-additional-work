fun main(){
    var jeep=Car("nassan","KDA",0)
    println(jeep.make)
    jeep.start()
    jeep.accelerate(70)
    jeep.accelerate(60)
    println(jeep.speed)
    jeep.deccelerate(40)
    println(jeep.speed)
}
class Car(var make:String,var model:String,var speed:Int) {
    fun start() {
        println("vuuuuuuu")
    }

    fun accelerate(acceleration: Int): Int {
        speed += acceleration
        return speed
    }

    fun deccelerate(decceleration: Int): Int {
        speed-= decceleration
        return speed

    }
}


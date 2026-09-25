
open class Vehicle(val name: String, val maxSpeed: Int) {

    open fun describe(): String {
        return "$name dapat melaju hingga $maxSpeed km/h"
    }
}

class Car(name: String, val numberOfDoors: Int) : Vehicle(name, 180) {
    override fun describe(): String {
        // Kita bisa memanfaatkan super.describe() atau menulis ulang stringnya
        return "${super.describe()} dan punya $numberOfDoors pintu"
    }
}

class Motorcycle(name: String, val hasSidecar: Boolean) : Vehicle(name, 220) {
    override fun describe(): String {
        val sidecarText = if (hasSidecar) "dengan sidecar" else "tanpa sidecar"
        return "${super.describe()} ($sidecarText)"
    }
}

fun main() {
    val vehicles = listOf<Vehicle>(
        Car("Toyota", numberOfDoors = 4),
        Motorcycle("Ninja", hasSidecar = false),
        Motorcycle("Vespa", hasSidecar = true) // Contoh tambahan
    )

    vehicles.forEach { println(it.describe()) }
}
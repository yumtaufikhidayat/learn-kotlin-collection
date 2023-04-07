package main.kotlin.map

fun main() {
    propertiesOnMap()
}

fun propertiesOnMap() {
    val application = Application(mapOf(
        "name" to "Kotlin App",
        "version" to 1
    ))
    println("Application name: ${application.name}")
    println("Application version: ${application.version}")
}

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: Int by map
}
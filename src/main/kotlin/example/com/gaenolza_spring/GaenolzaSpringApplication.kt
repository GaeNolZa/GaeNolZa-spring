package example.com.gaenolza_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@SpringBootApplication
class GaenolzaSpringApplication {
    @GetMapping("/hello")
    fun sayHello(@RequestParam(value = "myName", defaultValue = "World") name: String): String {
        return "Hello $name!"
    }
}

fun main(args: Array<String>) {
    runApplication<GaenolzaSpringApplication>(*args)
}

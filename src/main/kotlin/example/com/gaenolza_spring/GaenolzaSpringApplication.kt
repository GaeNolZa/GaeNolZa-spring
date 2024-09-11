package example.com.gaenolza_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@SpringBootApplication
class GaenolzaSpringApplication {

}

fun main(args: Array<String>) {
    runApplication<GaenolzaSpringApplication>(*args)
}

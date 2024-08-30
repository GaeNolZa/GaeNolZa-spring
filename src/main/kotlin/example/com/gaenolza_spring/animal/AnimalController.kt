package example.com.gaenolza_spring.animal

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/animal")
class AnimalController(private val animalRepository: AnimalRepository) {

    @PostMapping("/add")
    fun addAnimal(@RequestBody animal: Animal): String {
        animalRepository.save(animal)
        return "Added new animal to repo!"
    }

    @GetMapping("/list")
    fun getAnimals(): Iterable<Animal> {
        return animalRepository.findAll()
    }

    @GetMapping("/find/id/{customerId}")
    fun findAnimalsByCustomerId(@PathVariable customerId: Int): List<Animal> {
        return animalRepository.findAnimalsByCustomerId(customerId)
    }
}
package example.com.gaenolza_spring.animal

import org.springframework.data.repository.CrudRepository

interface AnimalRepository : CrudRepository<Animal, Int> {

    fun findAnimalsByCustomerId(customerId: Int): List<Animal>
}
package example.com.gaenolza_spring.animal

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
data class Animal(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var animalId: Int = 0,
    var customerId: Int,
    var animalName: String = "",
    var animalSpecies: String = "",
    var animalBirthdate: LocalDate = LocalDate.now(),
    var gender: String = "",
)
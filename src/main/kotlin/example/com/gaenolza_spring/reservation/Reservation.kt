package example.com.gaenolza_spring.reservation

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
data class Reservation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var reservationId: Int = 0,
    var facilityId: Int = 0,
    var animalId: Int = 0,
    var reservationDate: LocalDate = LocalDate.now(),
    var customerId: Int = 0,
)
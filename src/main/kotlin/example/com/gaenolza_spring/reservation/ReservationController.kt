package example.com.gaenolza_spring.reservation

import example.com.gaenolza_spring.Customer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("/reservation")
class ReservationController(private val reservationRepository: ReservationRepository) {

    @GetMapping("/list")
    fun getReservations(): Iterable<Reservation> {
        return reservationRepository.findAll()
    }

    @PostMapping("/add")
    fun addReservation(@RequestBody reservation: Reservation): String {
        reservationRepository.save(reservation)
        return "Added new reservation to repo"
    }

    @GetMapping("/list/customer/{customerId}")
    fun findReservationsByCustomerId(@PathVariable customerId: Int): List<Reservation> {
        return reservationRepository.findReservationsByCustomerId(customerId)
    }

    @GetMapping("/list/facility/{facilityId}")
    fun findReservationsByFacilityId(@PathVariable facilityId: Int): List<Reservation> {
        return reservationRepository.findReservationsByFacilityId(facilityId)
    }

    @GetMapping("/list/customer/{customerId}/date/{reservationDate}")
    fun findReservationsByCustomerIdAndReservationDate(
        @PathVariable customerId: Int,
        @PathVariable reservationDate: LocalDate
    ): List<Reservation> {
        return reservationRepository.findReservationsByCustomerIdAndReservationDate(customerId, reservationDate)
    }

    @GetMapping("/list/facility/{facilityId}/date/{reservationDate}")
    fun findReservationsByFacilityIdAndReservationDate(
        @PathVariable facilityId: Int,
        @PathVariable reservationDate: LocalDate
    ): List<Reservation> {
        return reservationRepository.findReservationsByFacilityIdAndReservationDate(facilityId, reservationDate)
    }
}
package example.com.gaenolza_spring.reservation

import org.springframework.data.repository.CrudRepository
import java.time.LocalDate

interface ReservationRepository : CrudRepository<Reservation, Int> {

    fun findReservationsByCustomerId(customerId: Int): List<Reservation>
    fun findReservationsByFacilityId(facilityId: Int): List<Reservation>

    fun findReservationsByCustomerIdAndReservationDate(customerId: Int, reservationDate: LocalDate): List<Reservation>
    fun findReservationsByFacilityIdAndReservationDate(facilityId: Int, reservationDate: LocalDate): List<Reservation>
}
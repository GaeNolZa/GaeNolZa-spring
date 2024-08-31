package example.com.gaenolza_spring.facility

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Facility(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var facilityId: Int = 0,
    var address: String = "",
    var facilityName: String = "",
    var facilityContact: String = "",
    var ownedFacility: String = "",
    var rating: Float = 0f,
    var reviewCount: Int = 0,
    var numberOfRooms: Int = 0,
)
package example.com.gaenolza_spring

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var customerId: Int = 0,
    var customerName: String = "",
    var phoneNumber: String = "",
    var password: String = ""
)
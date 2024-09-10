package example.com.gaenolza_spring

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Int> {

    fun findCustomerByCustomerId(customerId: Int): Customer?
    fun findCustomerByCustomerName(customerName: String): Customer?
    fun findCustomerByEmail(email: String): Customer?
}

data class LoginRequest(
    val email: String,
    val password: String
)
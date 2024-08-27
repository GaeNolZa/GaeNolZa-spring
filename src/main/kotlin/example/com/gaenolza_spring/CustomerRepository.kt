package example.com.gaenolza_spring

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Int> {

    fun findCustomerByCustomerId(customerId: Int): Customer?
}
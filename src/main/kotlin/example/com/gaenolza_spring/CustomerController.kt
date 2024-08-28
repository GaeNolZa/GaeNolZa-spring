package example.com.gaenolza_spring

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customer")
class CustomerController(private val customerRepository: CustomerRepository) {

    @PostMapping("/add")
    fun addCustomer(@RequestBody customer: Customer): String {
        customerRepository.save(customer)
        return "Added new customer to repo!"
    }

    @GetMapping("/list")
    fun getCustomers(): Iterable<Customer> {
        return customerRepository.findAll()
    }

    @GetMapping("/find/id/{customerId}")
    fun findCustomerByCustomerId(@PathVariable customerId: Int): Customer? {
        return customerRepository.findCustomerByCustomerId(customerId)
    }

    @GetMapping("/find/name/{customerName}")
    fun findCustomerByCustomerName(@PathVariable customerName: String): Customer? {
        return customerRepository.findCustomerByCustomerName(customerName)
    }

    @GetMapping("/find/email/{email}")
    fun findCustomerByEmail(@PathVariable email: String): Customer? {
        return customerRepository.findCustomerByEmail(email)
    }

    @PostMapping("/login")
    fun login(@RequestBody loginRequest: LoginRequest): ResponseEntity<Any> {
        val customer = customerRepository.findCustomerByEmail(loginRequest.email)
        return if (customer != null && customer.password == loginRequest.password) {
            ResponseEntity.ok("Login successful")
        } else {
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials")
        }
    }
}
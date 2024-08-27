package example.com.gaenolza_spring

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

    @GetMapping("/find/{customerId}")
    fun findCustomerByCustomerId(@PathVariable customerId: Int): Customer? {
        return customerRepository.findCustomerByCustomerId(customerId)
    }
}
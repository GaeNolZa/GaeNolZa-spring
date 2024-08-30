package example.com.gaenolza_spring.facility

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/facility")
class FacilityController(private val facilityRepository: FacilityRepository) {

    @GetMapping("/list")
    fun getFacilities(): Iterable<Facility> {
        return facilityRepository.findAll()
    }

    @PostMapping("/add")
    fun addFacility(@RequestBody facility: Facility): String {
        facilityRepository.save(facility)
        return "Added new facility to repo"
    }
}
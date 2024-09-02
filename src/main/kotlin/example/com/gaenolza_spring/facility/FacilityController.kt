package example.com.gaenolza_spring.facility

import org.springframework.web.bind.annotation.*

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

    @GetMapping("/search")
    fun searchFacilitiesByName(@RequestParam name: String): List<Facility> {
        return facilityRepository.findByFacilityNameContaining(name)
    }

    @GetMapping("/find/id/{facilityId}")
    fun findFacilityByFacilityId(@PathVariable facilityId: Int): Facility? {
        return facilityRepository.findFacilityByFacilityId(facilityId)
    }
}
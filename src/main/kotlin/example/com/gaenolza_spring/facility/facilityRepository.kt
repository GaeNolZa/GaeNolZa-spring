package example.com.gaenolza_spring.facility

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface FacilityRepository : CrudRepository<Facility, Int> {

    fun findByFacilityNameContaining(@Param("name") name: String): List<Facility>
}
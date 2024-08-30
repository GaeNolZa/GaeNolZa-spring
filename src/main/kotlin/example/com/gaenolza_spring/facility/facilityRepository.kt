package example.com.gaenolza_spring.facility

import org.springframework.data.repository.CrudRepository

interface FacilityRepository : CrudRepository<Facility, Int> {

}
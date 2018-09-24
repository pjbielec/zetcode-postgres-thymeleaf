package zetcodepostgresthymeleaf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zetcodepostgresthymeleaf.bean.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
}

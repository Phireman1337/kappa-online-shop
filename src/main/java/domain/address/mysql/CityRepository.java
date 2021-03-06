package domain.address.mysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CityRepository extends CrudRepository<City, Integer> {

    City findByCityName(String cityName);

}

package domain.address.mysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Repository
@Transactional
public interface ZipCodeRepository extends CrudRepository<ZipCode, String> {

    List<ZipCode> findAllByCity(City city);

}

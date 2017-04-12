package domain.customer.mysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findByEmailAddress(String emailAddress);

}

package domain.order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OrderedProductRepository extends CrudRepository<OrderedProduct, Integer> {



}

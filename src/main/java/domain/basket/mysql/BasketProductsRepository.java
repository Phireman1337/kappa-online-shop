package domain.basket.mysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface BasketProductsRepository extends CrudRepository<BasketProducts, Integer> {



}

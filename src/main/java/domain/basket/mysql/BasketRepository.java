package domain.basket.mysql;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface BasketRepository extends CrudRepository<Basket, String> {



}

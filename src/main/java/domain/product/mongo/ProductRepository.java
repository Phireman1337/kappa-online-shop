package domain.product.mongo;


import domain.product.mongo.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends org.springframework.data.mongodb.repository.MongoRepository<Product, String> {



}

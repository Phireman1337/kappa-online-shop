package mongo;


import app.Application;
import com.mongodb.BasicDBObject;
import mongo.PricingDetail;
import mongo.Product;
import mongo.ProductRepository;
import mongo.ShippingDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})

public class ProductTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void crudTest() {

        Map<String, String> productDetails = new HashMap<>();
        productDetails.put("shave quality", "best in class");
        productDetails.put("power efficiency", "best in class");
        productDetails.put("ergonomic", "best in class");

        Product product = new Product("Phillips Test Product",
                "The very best test electric shaver from phillips",
                "Electric shaver",
                Arrays.asList("Phillips"),
                Arrays.asList("path_to_photo1"),
                new ShippingDetail(13.2, 26.0, 15.0, 4.0),
                new PricingDetail(129, 99),
                new BasicDBObject(productDetails));

        product = productRepository.save(product);

        assert productRepository.findOne(product.getId()) != null && productRepository.findOne(product.getId()).getTitle().equals("Phillips Test Product");

        product.setTitle("Phillips Electric Shaver");

        productRepository.save(product);

        assert productRepository.findOne(product.getId()).getTitle().equals("Phillips Electric Shaver");

        productRepository.delete(product);

        assert productRepository.findOne(product.getId()) == null;


    }

}




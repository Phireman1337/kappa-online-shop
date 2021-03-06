package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import mongo.ProductRepository;


@SpringBootApplication(scanBasePackages = {"controllers"})
@EnableMongoRepositories(basePackageClasses = {ProductRepository.class})
@EnableJpaRepositories(basePackages = "domain")
@EntityScan(basePackages = "domain")
public class Application {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}


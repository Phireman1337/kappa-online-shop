package app;

import controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repositories.ProductRepository;
import repositories.UserRepository;

import java.util.Arrays;


@SpringBootApplication(scanBasePackages = {"controllers"})
@EnableMongoRepositories(basePackageClasses = {ProductRepository.class})
//@ComponentScan("repositories")
//@EnableAutoConfiguration
//@Configuration
//@ComponentScan(basePackageClasses = {ProductRepository.class, GreetingController.class, Application.class, })
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}

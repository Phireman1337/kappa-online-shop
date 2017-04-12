package controllers;

import domain.customer.mysql.Customer;
import domain.customer.mysql.CustomerRepository;
import domain.product.mongo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repositories.UserRepository;

import java.sql.Date;


@Controller
public class GreetingController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/greeting") // @RequestMapping(method=GET) to narrow the mapping
    public String greeting(@RequestParam(value="name", required = false, defaultValue = "World") String name,
                           Model model){
            model.addAttribute("name", name);
            userRepository.save(new User("John", "Test"));
        customerRepository.save(new Customer('M', "John", "Sonmez", new Date(System.currentTimeMillis()),
                "sonmez@simpleprogrammer.com", "PASSWORD"));
            return "greeting";
    }



}

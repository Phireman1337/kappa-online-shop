package controllers;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repositories.UserRepository;


@Controller
public class GreetingController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/greeting") // @RequestMapping(method=GET) to narrow the mapping
    public String greeting(@RequestParam(value="name", required = false, defaultValue = "World") String name,
                           Model model){
            model.addAttribute("name", name);
            userRepository.save(new User("John", "Test"));
            return "greeting";
    }



}

package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AdminPanelSearchController {

    @RequestMapping(value = "/admin/search", method = RequestMethod.GET)
    public String search(@RequestParam(value = "keyword", required = false) String keyword, Model model){

        System.out.println("[search controllers] i've been called and keyword is " + keyword );
        return "admin/search"; // this returns a damn template  WAS ?!

    }
}

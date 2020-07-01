package za.co.dotze.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author : Christiaan Dotze christiaan@psybergate.co.za
 * Date   : 31 May 2020
 */
@Controller()
public class UserController {

    @RequestMapping("/")
    public String index() {
        System.out.println("Home");
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("About");
        return "about";
    }

    @RequestMapping("/projects")
    public String projects() {
        System.out.println("Projects");
        return "projects";
    }
}

package tk.telegraph2.docs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tk.telegraph2.docs.service.UserService;

@Controller
public class HomeController {
    private UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model){
        boolean isLogged=userService.findLoggedInUsername()!=null && ! userService.findLoggedInUsername().equals("anonymousUser");
        model.addAttribute("isLogged",isLogged);
        return "index";
    }

}

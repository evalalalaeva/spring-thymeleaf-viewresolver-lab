package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * A plain @Controller (not @RestController) so that the returned
 * String is treated as a LOGICAL VIEW NAME, not raw response body.
 * DispatcherServlet hands that name to the registered ViewResolver(s).
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "น.ส.พิไลพร คำเวียง");
        model.addAttribute("studentId", "673380286-0");
        return "home"; // resolved by ThymeleafConfig to classpath:/custom-templates/home.html
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("intro","Currently study in College of computing KKU");
        return "about";
    }

    
}

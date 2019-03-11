package com.example.lesson102;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
            @RequestMapping("/")
            public String startingPoint(Model model){
                String message = "Say hello to the people";
                model.addAttribute("myvar",message);
                return "hometemplate";
            }
}

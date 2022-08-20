package ru.job4j.dream.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String mainPage(Model model) {
        model.addAttribute("index", "Main page for navigation");
        return "index";
    }
}

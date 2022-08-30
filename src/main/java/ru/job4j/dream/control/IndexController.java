package ru.job4j.dream.control;

import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@ThreadSafe
@Controller
public class IndexController {

    @GetMapping("/index")
    public String mainPage(Model model) {
        model.addAttribute("index", "Main page for navigation");
        return "index";
    }
}

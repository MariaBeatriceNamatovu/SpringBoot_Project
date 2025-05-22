package pl.edu.vistula.SpringBoot.Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class SpringBoot_ProjectController {

    @GetMapping(value = "/")
    public String hello() {
        return "Landing";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", defaultValue = "World", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "Landing";
    }
    //http://localhost:8080/greeting?name=Everyone
}

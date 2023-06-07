package me.personalproject.springjocksapp.controllers;

import me.personalproject.springjocksapp.services.JockService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JockController {

    private final JockService jockService;

    public JockController(JockService jockService) {
        this.jockService = jockService;
    }

    @RequestMapping({"/", ""})
    public String showJock(Model model) {
        model.addAttribute("jock", jockService.getJock());
        return "index";
    }

}

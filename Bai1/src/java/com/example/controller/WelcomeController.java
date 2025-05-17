package com.example.controller;

import com.example.model.WelcomeModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String showWelcomePage(Model model) {
        WelcomeModel welcomeModel = new WelcomeModel();

        model.addAttribute("message", welcomeModel.getMessage());
        model.addAttribute("currentTime", welcomeModel.getCurrentTime());

        return "index"; // Trả về trang JSP: index.jsp
    }
}
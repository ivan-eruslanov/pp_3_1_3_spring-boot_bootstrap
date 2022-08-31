package ru.eruslanov.springboot_bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.eruslanov.springboot_bootstrap.service.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getShowCurrentUser(Model model, Principal principal) {
        model.addAttribute("authUser", userService.getUserByName(principal.getName()));
        return "user";
    }
}

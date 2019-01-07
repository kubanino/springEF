package com.example.springef.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.example.springef.security.UserDetailsProvider.getCurrentUserName;

@Controller
public class MainController
{
    @RequestMapping("/")
    public String indexTemplate()
    {
        // TODO: i'm going for a template view - check me out!
        return "indexTemplate";
    }

    @RequestMapping("/dynamic")
    public String dynamic(@RequestParam("color") String color,
                          @RequestParam(required = false, defaultValue = "something") String paramWithDefault,
                          Model model)
    {
        model.addAttribute("userName", getCurrentUserName());
        model.addAttribute("color", color);
        model.addAttribute("anotherVariable", paramWithDefault);
        model.addAttribute("message", "Greetings Dynamic Martians from Main Controller!");
        return "dynamicTemplate";
    }
}

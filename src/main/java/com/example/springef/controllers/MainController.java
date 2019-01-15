package com.example.springef.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.example.springef.security.UserDetailsProvider.getCurrentUserName;
import static java.util.Arrays.asList;

@Controller
public class MainController
{
    @RequestMapping("/")
    public String indexTemplate(Model model)
    {
        model.addAttribute("metaTitle", "Home Page");

        return "index";
    }

    @RequestMapping(value = "/searchResult", method = RequestMethod.POST)
    public String searchResult(HttpServletRequest request, RedirectAttributes redirectAttributes, Model model)
    {
        String inputString = request.getParameter("search");
        model.addAttribute("inputString", inputString);
        model.addAttribute("error", "test error message");

        if (inputString.contains("Something bad, we will see"))
        {
            redirectAttributes.addFlashAttribute("error", "Something went wrong Man");
            return "redirect:/";
        }
        redirectAttributes.addAttribute("search", inputString);

        return "redirect:searchResult";
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

        List<String> simpleList = asList("one", "two", "five", "six");
        model.addAttribute("listed", simpleList);

        return "index";
    }
}

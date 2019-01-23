package com.example.springef.controllers;

import com.example.springef.domain.model.ProfileForm;
import com.example.springef.formatters.USLocalDateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class ProfileController
{
    @RequestMapping("/profile")
    public String displayProfile(ProfileForm profileForm)
    {
        return "profile/profilePage";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String saveProfile(@Valid ProfileForm profileForm, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
        {
            return "profile/profilePage";
        }

        System.out.println("Success, it is saved: " + profileForm);
        return "redirect:/profile";
    }

    @ModelAttribute("dateFormat")
    public String localeFormat(Locale locale)
    {
        return USLocalDateFormatter.getPattern(locale);
    }
}

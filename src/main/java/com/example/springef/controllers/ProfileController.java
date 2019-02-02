package com.example.springef.controllers;

import com.example.springef.domain.model.ProfileForm;
import com.example.springef.formatters.USLocalDateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Locale;

import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ProfileController
{
    @RequestMapping("/profile")
    public String displayProfile(ProfileForm profileForm, HttpServletRequest request, Model model)
    {
        if (!isEmpty(request.getParameter("lang")))
        {
            model.addAttribute("lang", request.getParameter("lang"));
        }
        return "profile/profilePage";
    }

    @RequestMapping(value = "/profile", method = POST, params = {"save"})
    public String saveProfile(@Valid ProfileForm profileForm, BindingResult bindingResult,
                              HttpServletRequest request, Model model)
    {
        if (!isEmpty(request.getParameter("lang")))
        {
            model.addAttribute("lang", request.getParameter("lang"));
        }
        if (bindingResult.hasErrors())
        {
            return "profile/profilePage";
        }
        //return "redirect:/profile";
        return "profile/profilePage";
    }

    @RequestMapping(value = "/profile", method = POST, params = {"removeTaste"})
    public String removeRow(ProfileForm profileForm, HttpServletRequest request)
    {
        Integer rowId = Integer.valueOf(request.getParameter("removeTaste"));
        profileForm.getTastes().remove(rowId.intValue());
        return "profile/profilePage";
    }

    @RequestMapping(value = "profile", method = POST, params = {"addTaste"})
    public String addRow(ProfileForm profileForm)
    {
        profileForm.getTastes().add(null);
        return "profile/profilePage";
    }

    @ModelAttribute("dateFormat")
    public String localeFormat(Locale locale)
    {
        return USLocalDateFormatter.getPattern(locale);
    }
}

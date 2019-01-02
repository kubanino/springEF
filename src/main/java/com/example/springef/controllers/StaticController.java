package com.example.springef.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StaticController
{
    @ResponseBody
    @RequestMapping("/static")
    public String staticText()
    {
        return "This is ugly static content...";
    }
}

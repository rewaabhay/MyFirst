package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {
    
    @RequestMapping("/Home")
    public ModelAndView aboutPage() {
        
        return new ModelAndView("Home");
    }
    
    @RequestMapping("/First")
    public ModelAndView contactPage() {
        
        return new ModelAndView("First");
    }
    
}
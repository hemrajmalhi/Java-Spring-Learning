package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String Home(Model model){
        model.addAttribute("name","Hemraj malhi");
        List<String> name=new ArrayList<>();
        name.add("heer");
        name.add("raja");
        name.add("pawan");
        model.addAttribute("f",name);
        return "home";
    }
     @RequestMapping("/about")
    public ModelAndView About(){
         ModelAndView modelAndView=new ModelAndView();
         modelAndView.addObject("name","Hemraj");
         modelAndView.addObject("id",39);
         LocalDateTime now= LocalDateTime.now();
         modelAndView.addObject("time",now);
         modelAndView.setViewName("about");

        return modelAndView;
    }
}

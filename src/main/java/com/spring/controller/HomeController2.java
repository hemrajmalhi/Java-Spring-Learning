package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/first")  //class based url mapping
public class HomeController2 {
        @RequestMapping(path = "/home",method = RequestMethod.GET)  //it fires the url this format /first/home
        public String Home(Model model){
            model.addAttribute("name","sunny");
            List<String> name=new ArrayList<>();
            name.add("x");
            name.add("y");
            model.addAttribute("f",name);
            return "home";
        }
        @RequestMapping("/about")
        public ModelAndView About(){
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.addObject("name","xyz");
            modelAndView.addObject("id",39);
            LocalDateTime now= LocalDateTime.now();
            modelAndView.addObject("time",now);
            modelAndView.setViewName("about");

            return modelAndView;
        }
    }





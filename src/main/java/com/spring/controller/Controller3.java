package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;



@Controller
public class Controller3 {


    @RequestMapping("/one")
    public RedirectView OneUrl(){
        RedirectView redirectView=new RedirectView(); //redirect using redirectView
//        return "redirect:enjoy"     //redirect using prefix
        redirectView.setUrl("test");
        return redirectView;
    }

    @RequestMapping("/test")
    public String EnjoyUrl(){
        return "success";
    }

}

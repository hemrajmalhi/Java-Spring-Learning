package com.spring.controller;
import com.spring.model.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.Attribute;
import javax.servlet.http.HttpServletRequest;


@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void CommonDataModel(Model m){
        m.addAttribute("header1","Registration Form Of MVC");
        m.addAttribute("Desc","Early bird get 50% Flat");
    }
    @RequestMapping("/contact")
    public String Contact() {
        return "contact";
    }
//    @RequestMapping(path = "/processform", method = RequestMethod.POST)

//  First Way - Mapping through @RequestParam
//    public String ProcessForm(@RequestParam("email") String email, @RequestParam(name = "name",required=true) String name, @RequestParam("lname") String lname, Model model)

//         First Way - process the data
//            System.out.println("username " +email+" name "+name +" lname "+lname);
//            model.addAttribute("name",name);
//            model.addAttribute("lname",lname);
//            model.addAttribute("email",email);
//    {
////   Second Way - process the data
//
//        User user=new User();
//        user.setEmail(email);
//        user.setName(name);
//        user.setLname(lname);
//        System.out.println(user);
//        model.addAttribute("user",user);
//        return "success";
//}

    // Second way - mapping through ModelAttribute
    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String ProcessForm( @ModelAttribute User user ,Model model) {
        this.userService.createUser(user);
        Integer id=(Integer)this.userService.createUser(user);
        model.addAttribute("id",id);
       return "success";
   }
    }





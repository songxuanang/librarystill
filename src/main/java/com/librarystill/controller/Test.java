package com.librarystill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {

    @RequestMapping("/login")
    public String index(){
//        ModelAndView mav = new ModelAndView("leadpage/index");
        return "leadpage/index";

    }
}

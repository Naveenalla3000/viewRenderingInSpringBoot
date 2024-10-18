package com.naveen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerOne {

    // to render sting
    @GetMapping("/itsraining")
    public String renderString(){
        return "Its raining in klu";
    }

    // to render .html
    @GetMapping("/html")
    public String renderHtmlPage(){
        System.out.println("html.....");
        return "index";
    }
}

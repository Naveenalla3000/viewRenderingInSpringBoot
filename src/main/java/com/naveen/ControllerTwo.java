package com.naveen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTwo {

    @GetMapping("/jsp")
    public String renderJSP(Model model){
        System.out.println("jsp page rendered....");
        model.addAttribute("message","Hiii from controller");
        String[] names = new String[]{"some name","another name","another namesssss"};
        model.addAttribute("names",names);
        return "index";
    }


}

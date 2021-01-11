package com.example.SpringBeginnerEasy.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {

    // localhost:8080/test2.htmlとすればアクセスできる
    // RequestMapping("/test2.html")でlocalhost:8080/test2とするとアクセスできない
    @RequestMapping("/test2.html")
    public String test2(Model model){
        model.addAttribute("title", "Spring SAMPLE!");
        return "test2";
    }
}

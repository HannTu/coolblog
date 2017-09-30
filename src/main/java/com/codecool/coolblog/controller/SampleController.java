package com.codecool.coolblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ehantul on 2017-09-30.
 */
@Controller
public class SampleController {

    @RequestMapping("/")
    public String helloWorld(Model model){
        model.addAttribute("headline", "Pierwszy widok");
        model.addAttribute("message", "Witaj!");

        return "posts";
    }
}

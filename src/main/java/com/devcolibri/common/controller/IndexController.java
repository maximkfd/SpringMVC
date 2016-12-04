package com.devcolibri.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String returnShit(ModelMap model) {

        model.addAttribute("message", "Shit! FUCK! WHAT THE FUCK IS GOING ONE HERE?");
        return "hello";

    }

}
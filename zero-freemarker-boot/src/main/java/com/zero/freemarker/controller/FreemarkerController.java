package com.zero.freemarker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/freemarker")
public class FreemarkerController {

    @GetMapping("/info")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView("html/index");
        // add title to Model
        modelAndView.addObject("title", "Freemarker");
        return modelAndView;
    }

}
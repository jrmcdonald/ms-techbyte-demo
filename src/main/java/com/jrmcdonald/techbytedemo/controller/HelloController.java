package com.jrmcdonald.techbytedemo.controller;

import com.jrmcdonald.techbytedemo.config.ApplicationConfigurationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final ApplicationConfigurationProperties applicationConfigurationProperties;

    @GetMapping("/hello")
    public String greeting(Model model) {
        model.addAttribute("name", applicationConfigurationProperties.getName());
        return "hello";
    }
}

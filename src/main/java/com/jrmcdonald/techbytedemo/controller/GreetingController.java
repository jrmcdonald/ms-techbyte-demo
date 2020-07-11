package com.jrmcdonald.techbytedemo.controller;

import com.jrmcdonald.techbytedemo.config.ApplicationConfigurationProperties;
import com.jrmcdonald.techbytedemo.config.TemplateConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class GreetingController {

    private final ApplicationConfigurationProperties properties;
    private final TemplateConfig templateConfig;

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", properties.getName());
        return templateConfig.getTemplate();
    }
}

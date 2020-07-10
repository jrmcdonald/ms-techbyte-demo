package com.jrmcdonald.techbytedemo.controller;

import com.jrmcdonald.techbytedemo.config.ApplicationConfigurationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@RefreshScope
@ConditionalOnProperty("app.goodbye")
public class GoodbyeController {

    private final ApplicationConfigurationProperties applicationConfigurationProperties;

    @GetMapping("/goodbye")
    public String greeting(Model model) {
        model.addAttribute("name", applicationConfigurationProperties.getName());
        return "goodbye";
    }
}

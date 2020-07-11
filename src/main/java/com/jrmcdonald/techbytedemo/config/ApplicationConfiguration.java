package com.jrmcdonald.techbytedemo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApplicationConfigurationProperties.class)
public class ApplicationConfiguration {

    @Bean
    @RefreshScope
    public TemplateConfig greetingTemplate(ApplicationConfigurationProperties properties) {
        // ConditionalOn* does not work with refresh so using if logic instead
        // https://stackoverflow.com/questions/52008261#comment90967560_52008261
        // To use ConditionalOn* then maybe restart_context would work
        if (properties.isGoodbye()) {
            return new TemplateConfig("goodbye");
        }
        return new TemplateConfig("hello");
    }
}

package com.jrmcdonald.techbytedemo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApplicationConfigurationProperties.class)
public class ApplicationConfiguration {
}

package com.jrmcdonald.techbytedemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("app")
public class ApplicationConfigurationProperties {

    private String name;
    private boolean goodbye;
}

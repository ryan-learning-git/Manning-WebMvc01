package com.ryan.webmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//minimal config as this is a web project
@Configuration
@ComponentScan(basePackages = {"com.ryan.webmvc"},
    excludeFilters = {
        @ComponentScan.Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
    })
public class RootConfig {
}

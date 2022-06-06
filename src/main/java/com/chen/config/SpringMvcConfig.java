package com.chen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.chen.controller","com.chen.config"})
@EnableWebMvc
public class SpringMvcConfig {
}

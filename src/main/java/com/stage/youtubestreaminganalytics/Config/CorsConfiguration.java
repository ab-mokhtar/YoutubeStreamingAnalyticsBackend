package com.stage.youtubestreaminganalytics.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*") // Specify the origin of your Angular app
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true);  // Allow credentials (e.g., cookies) to be sent
    }
}


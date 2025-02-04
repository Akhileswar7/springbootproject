package com.vedait.springbootproject;

import org.springdoc.core.models.GroupedOpenApi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi doctorApi() {
        return GroupedOpenApi.builder()
                .group("Doctor APIs")
                .pathsToMatch("/doctor/**")
                .build();
    }

    @Bean
    public GroupedOpenApi patientApi() {
        return GroupedOpenApi.builder()
                .group("Admin APIs")
                .pathsToMatch("/admin/**") 
                .build();
    }

    @Bean
    public GroupedOpenApi appointmentApi() {
        return GroupedOpenApi.builder()
                .group("User APIs")
                .pathsToMatch("/user/**")
                .build();
    }
}

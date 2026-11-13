package com.smartfood.infra.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI CustomOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SmartFood AI API")
                        .version("1.0.0")
                        .description("""
                                REST API for food delivery with AI assistance.
                                Provides food recommendations and natural language
                                order assistance.
                                """));
    }
}

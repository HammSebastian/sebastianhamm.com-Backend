/**
 * Copyright (c) 2026 Sebastian Hamm. All Rights Reserved.
 *
 * @author Sebastian Hamm
 * @website sebastianhamm.com
 * @version 1.0.0
 * @since 1/17/26
 */
package com.sebastianhamm.backend.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-jwt",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                        )
                )
                .info(new Info()
                        .title("My Spring Boot API")
                        .version("1.0.0")
                        .description("This is the API documentation for my Spring Boot project")
                );
    }
}

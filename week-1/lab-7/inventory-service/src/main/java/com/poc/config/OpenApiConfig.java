package com.poc.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI inventoryApi(){
        return new OpenAPI().components(new Components())
                .info(new Info().title("inventory service v1").description("inventory v1 service"));
    }

}

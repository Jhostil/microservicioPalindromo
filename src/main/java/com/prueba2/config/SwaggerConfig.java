package com.prueba2.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Microservicio-Procesar Palíndromos",
                description = "API para procesar frases y versificar si son palíndromos")
)
public class SwaggerConfig {


}

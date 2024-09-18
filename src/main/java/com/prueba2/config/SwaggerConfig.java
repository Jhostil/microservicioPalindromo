package com.prueba2.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

/**
 * Clase para configurar el título y la descripción de la documentación de Swagger
 */
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Microservicio-Procesar Palíndromos",
                description = "API para procesar frases y versificar si son palíndromos")
)
public class SwaggerConfig {


}

package com.scode;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Spring Reactive", version = "1.0",
        description = "API for Cassandra DB Communication"))
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
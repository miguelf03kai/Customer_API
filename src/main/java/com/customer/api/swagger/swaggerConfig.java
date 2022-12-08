package com.customer.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class swaggerConfig {

	@Bean
	public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("Customer API")
	              .description("Spring Customer API")
	              .version("v1.0")
	              .license(new License().name("Free").url("https://github.com/miguelf03kai")))
	              .externalDocs(new ExternalDocumentation()
	              .description("Wiki Documentation")
	              .url("https://github.com/miguelf03kai"));
	 }
}

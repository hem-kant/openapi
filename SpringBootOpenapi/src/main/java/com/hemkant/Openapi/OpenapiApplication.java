package com.hemkant.Openapi;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

@SpringBootApplication
public class OpenapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiApplication.class, args);
	}
	@Bean
	public OpenAPI eazyShopOpenAPI() {
		List<Tag> tags = new ArrayList<>();
		Tag tag = new Tag();
		tag.setName("Category");
		tags.add(tag);
		return new OpenAPI()
				.info(new Info().title("Shop API")
						.description("shop sample application")
						.version("v0.0.1")
						.contact(new Contact().name("Shop Online").email("hemkant.india@gmail.com")
								.url("http://hem-kant.blogspot.com/"))
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
						.description("Shop Wiki Documentation")
						.url("https://github.com/hem-kant/openapi"))
				.tags(tags);


	}
}

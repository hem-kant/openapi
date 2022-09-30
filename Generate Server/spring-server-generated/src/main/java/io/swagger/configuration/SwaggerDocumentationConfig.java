package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-30T12:42:14.200Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Shop Online APIs Definition")
            .description("## About Us  Using this `OpenAPI specification`, any consumer can understand the _APIs_ that are exposed by the ***Shop-Online*** team.  # Product Categories    - Mobiles      - Apple      - Samsung      - OnePlus    - Laptops    - Watches    - Accessories       - TV      - Home Appliances ")
            .license("OnlineShop License")
            .licenseUrl("http://hem-kant.blogspot.com/")
            .termsOfServiceUrl("http://hem-kant.blogspot.com/")
            .version("0.0.1")
            .contact(new Contact("","", "hemkant.india@gmail.com"))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Shop Online APIs Definition")
                .description("## About Us  Using this `OpenAPI specification`, any consumer can understand the _APIs_ that are exposed by the ***Shop-Online*** team.  # Product Categories    - Mobiles      - Apple      - Samsung      - OnePlus    - Laptops    - Watches    - Accessories       - TV      - Home Appliances ")
                .termsOfService("http://hem-kant.blogspot.com/")
                .version("0.0.1")
                .license(new License()
                    .name("OnlineShop License")
                    .url("http://hem-kant.blogspot.com/"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("hemkant.india@gmail.com")));
    }

}

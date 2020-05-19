package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-04T16:19:27.367Z")

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("fis-paas-bigdata")
            .description("Servicio API Gateway AWS perteneciente al aplicativo FIS bigdata que contiene todas las firmas de contrato para la gestión de información de bigdata. Puedes conseguir más información en nuestro sitio web [https://aws.amazon.com/big-data/getting-started/](https://aws.amazon.com/big-data/getting-started/).")
            .license("Company API License")
            .licenseUrl("https://aws.amazon.com/big-data/getting-started/")
            .termsOfServiceUrl("https://aws.amazon.com/big-data/getting-started/")
            .version("1.0.0")
            .contact(new Contact("","", "monballiachi@gmail.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}

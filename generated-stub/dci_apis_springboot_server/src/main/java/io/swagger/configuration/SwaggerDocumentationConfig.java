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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")
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
            .title("Interoperability APIs - Foundational/Functional registries")
            .description("The CRVS interoperability APIs describes different APIs some of them are usecase specific and other are generalized APIs to perform interoperable operations between CRVS registry and SP system. You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in upcoming version.  1. Search: The Search API provides functionality to search based on demographic, identifiers and custom query 2. Event subscription: The Event subscription APIs describe APIs useful to subscribe / unsubscribe events. When any event happens in crvs registry it sends event details on notify end point 3. Request status check: The request status checking APIs implement to check status of request sent in any above APIs  Gitbook reference link: - [CRVS - V1.0 ](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs)  Code directory links: - [Identifiers](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs/4.2-data-standards/4.2.2-code-directory#cd.01-identifier_type) - [Marital Status](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs/4.2-data-standards/4.2.2-code-directory#cd.02-marital_status) - [Sex](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs/4.2-data-standards/4.2.2-code-directory#cd.03-sex) - [Vital event types](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs/4.2-data-standards/4.2.2-code-directory#cd.04-vital_events)     Each request is build up of three parts - signature  - header  - message")
            .license("DCI Social Protection License")
            .licenseUrl("https://github.com/spdci/standards/blob/draft/LICENSE.md")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", "info@spdci.org"))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Interoperability APIs - Foundational/Functional registries")
                .description("The CRVS interoperability APIs describes different APIs some of them are usecase specific and other are generalized APIs to perform interoperable operations between CRVS registry and SP system. You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in upcoming version.  1. Search: The Search API provides functionality to search based on demographic, identifiers and custom query 2. Event subscription: The Event subscription APIs describe APIs useful to subscribe / unsubscribe events. When any event happens in crvs registry it sends event details on notify end point 3. Request status check: The request status checking APIs implement to check status of request sent in any above APIs  Gitbook reference link: - [CRVS - V1.0 ](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs)  Code directory links: - [Identifiers](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs/4.2-data-standards/4.2.2-code-directory#cd.01-identifier_type) - [Marital Status](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs/4.2-data-standards/4.2.2-code-directory#cd.02-marital_status) - [Sex](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs/4.2-data-standards/4.2.2-code-directory#cd.03-sex) - [Vital event types](https://digital-convergence-initiative-d.gitbook.io/dci-standards-1/wUwmJRFD0Hn6jI5xMat1/standards/1.-crvs/4.2-data-standards/4.2.2-code-directory#cd.04-vital_events)     Each request is build up of three parts - signature  - header  - message")
                .termsOfService("")
                .version("1.0.0")
                .license(new License()
                    .name("DCI Social Protection License")
                    .url("https://github.com/spdci/standards/blob/draft/LICENSE.md"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("info@spdci.org")));
    }

}

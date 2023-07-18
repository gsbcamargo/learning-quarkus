package org.gabriel.number;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
    info = @Info(title = "Number Microservice",
            description = "This microservice generates ISBN book numbers",
            version = "1.0",
            contact = @Contact(name = "@gsbcamargo", url = "https://github.com/gsbcamargo")),
    externalDocs = @ExternalDocumentation
                    (url = "https://github.com/gsbcamargo/learning-quarkus/tree/main/vintage-store/rest-number",
                    description = "All the Number Microservice code"),
    tags = {
        @Tag(name = "api", description = "Public API that generates ISBN 10 and ISBN 13 book numbers"),
        @Tag(name = "numbers", description = "Anybody interested in ISBN number format")
    }
)
public class NumberMicroservice extends Application {


    
}

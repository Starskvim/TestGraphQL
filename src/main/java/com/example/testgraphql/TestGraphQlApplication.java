package com.example.testgraphql;

import graphql.Scalars;
import graphql.analysis.MaxQueryDepthInstrumentation;
import graphql.schema.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class TestGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestGraphQlApplication.class, args);
    }

//    @Bean
//    GraphQLSchema schema() {
//        return GraphQLSchema.newSchema()
//                .withSchemaDirective()
//                .query(
//                        GraphQLObjectType.newObject()
//                                .name("query")
//                                .field(field -> field.name("test").type(Scalars.GraphQLString))
//                                .build())
//                .codeRegistry(
//                        GraphQLCodeRegistry.newCodeRegistry()
//                                .dataFetcher(FieldCoordinates.coordinates("query", "test"), test)
//                                .build())
//                .build();
//    }

    // .instrumentation(new MaxQueryComplexityInstrumentation(10))
    // .instrumentation(new MaxQueryDepthInstrumentation(4))

}

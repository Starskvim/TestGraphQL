package com.example.testgraphql.qraphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.testgraphql.entities.Animal;
import com.example.testgraphql.service.AnimalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AnimalMutation implements GraphQLMutationResolver {
    private final AnimalService service;

    public Animal createAnimal(String name, Integer weight, String type) {
        return service.createAnimal(name, weight, type);
    }
}

package com.example.testgraphql.qraphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.testgraphql.entities.Animal;
import com.example.testgraphql.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AnimalQuery implements GraphQLQueryResolver {

    private final AnimalService service;

    public List<Animal> getAnimals() {
        return service.getAllAnimal();
    }

    public Animal getAnimal(long id) {
        return service.getAnimal(id);
    }
}

package com.example.testgraphql.resolver;

import com.example.testgraphql.entities.Animal;
import com.example.testgraphql.service.AnimalServiceImpl;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@GraphQLApi
@RequiredArgsConstructor
public class AnimalResolver {

    public final AnimalServiceImpl animalService;

    @GraphQLQuery(name="getAllAnimal")
    public List<Animal> getAllAnimal() {
        return animalService.getAllAnimal();
    }

    @GraphQLQuery(name="getAnimal")
    public Animal getAnimal(long id) {
        return animalService.getAnimal(id);
    }

    @GraphQLMutation(name = "createAnimal")
    public Animal createAnimal(@GraphQLArgument(name="details") Animal animal) {
        return animalService.createAnimal(animal);
    }

}

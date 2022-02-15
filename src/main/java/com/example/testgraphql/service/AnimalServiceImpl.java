package com.example.testgraphql.service;

import com.example.testgraphql.entities.Animal;
import com.example.testgraphql.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {


    private final AnimalRepository animalRepository;

    public List<Animal> getAllAnimal() {
        return animalRepository.findAll();
    }

    public Animal getAnimal(long id) {
        return animalRepository.getById(id);
    }

    public Animal createAnimal(String name, Integer weight, String type) {
        final Animal animal = new Animal();
        animal.setAnimalName(name);
        animal.setWeight(weight);
        animal.setType(type);
        animal.setCreatedDate(LocalDate.now());

        System.out.println(animal);

        return animalRepository.save(animal);
    }
}

package com.example.testgraphql.service;

import com.example.testgraphql.entities.Animal;
import com.example.testgraphql.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    public Animal createAnimal(Animal animal) {
        return animalRepository.save(animal);
    }
}

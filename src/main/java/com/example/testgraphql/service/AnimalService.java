package com.example.testgraphql.service;

import com.example.testgraphql.entities.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> getAllAnimal();
    Animal getAnimal(long id);
    Animal createAnimal(String title, Integer author, String type);
}

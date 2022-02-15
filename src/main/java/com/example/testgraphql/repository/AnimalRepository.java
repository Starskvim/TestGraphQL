package com.example.testgraphql.repository;

import com.example.testgraphql.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
